package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBarButton4.ABI::class)
@Signature("{958fce6b-fd08-4414-8458-9d40866dc84e}")
@Guid("958fce6bfd08441484589d40866dc84e")
@WinRTInterface("958fce6bfd08441484589d40866dc84e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarButton4.ByReference::class)
public interface IAppBarButton4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAcceleratorTextOverride(): String?

  @InterfaceMethod(1)
  public fun put_KeyboardAcceleratorTextOverride(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBarButton4>
      {
    public override fun getValue() = ABI.makeIAppBarButton4(pointer.getPointer(0))

    public fun setValue(value: IAppBarButton4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarButton4 {
    public val __1843150316_Ptr: Pointer?

    public val _1843150316_VtblPtr: Pointer?
      get() = __1843150316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAcceleratorTextOverride(): String? {
      val fnPtr = _1843150316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1843150316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_KeyboardAcceleratorTextOverride(value: String?): Unit {
      val fnPtr = _1843150316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1843150316_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBarButton4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1843150316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarButton4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("958fce6bfd08441484589d40866dc84e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarButton4(ptr: Pointer?): WithDefault = IAppBarButton4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarButton4 {
      val address = segment.toRawLongValue()
      return makeIAppBarButton4(Pointer(address))
    }

    public override fun toNative(obj: IAppBarButton4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1843150316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarButton4): Array<IAppBarButton4?> = (elements as
        Array<IAppBarButton4?>).castToImpl<IAppBarButton4,IAppBarButton4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarButton4?> =
        arrayOfNulls<IAppBarButton4_Impl>(size) as Array<IAppBarButton4?>
  }
}
