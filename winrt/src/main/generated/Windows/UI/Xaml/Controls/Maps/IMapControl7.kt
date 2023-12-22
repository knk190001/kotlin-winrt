package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapControl7.ABI::class)
@Signature("{0d86e453-0c1f-4f7e-ae66-4ad0b4987857}")
@Guid("0d86e4530c1f4f7eae664ad0b4987857")
@WinRTInterface("0d86e4530c1f4f7eae664ad0b4987857")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControl7.ByReference::class)
public interface IMapControl7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Region(): String?

  @InterfaceMethod(1)
  public fun put_Region(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapControl7> {
    public override fun getValue() = ABI.makeIMapControl7(pointer.getPointer(0))

    public fun setValue(value: IMapControl7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControl7 {
    public val __1767447045_Ptr: Pointer?

    public val _1767447045_VtblPtr: Pointer?
      get() = __1767447045_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Region(): String? {
      val fnPtr = _1767447045_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1767447045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Region(value: String?): Unit {
      val fnPtr = _1767447045_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447045_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapControl7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767447045_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControl7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d86e4530c1f4f7eae664ad0b4987857")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControl7(ptr: Pointer?): WithDefault = IMapControl7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControl7 {
      val address = segment.toRawLongValue()
      return makeIMapControl7(Pointer(address))
    }

    public override fun toNative(obj: IMapControl7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767447045_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControl7): Array<IMapControl7?> = (elements as
        Array<IMapControl7?>).castToImpl<IMapControl7,IMapControl7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControl7?> =
        arrayOfNulls<IMapControl7_Impl>(size) as Array<IMapControl7?>
  }
}
