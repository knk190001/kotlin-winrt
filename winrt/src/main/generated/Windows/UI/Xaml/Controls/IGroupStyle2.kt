package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Style
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGroupStyle2.ABI::class)
@Signature("{69f90679-3a11-4fe7-b4df-2a0139d4018b}")
@Guid("69f906793a114fe7b4df2a0139d4018b")
@WinRTInterface("69f906793a114fe7b4df2a0139d4018b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupStyle2.ByReference::class)
public interface IGroupStyle2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderContainerStyle(): Style?

  @InterfaceMethod(1)
  public fun put_HeaderContainerStyle(value: Style?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGroupStyle2> {
    public override fun getValue() = ABI.makeIGroupStyle2(pointer.getPointer(0))

    public fun setValue(value: IGroupStyle2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupStyle2 {
    public val __803445348_Ptr: Pointer?

    public val _803445348_VtblPtr: Pointer?
      get() = __803445348_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderContainerStyle(): Style? {
      val fnPtr = _803445348_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__803445348_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HeaderContainerStyle(value: Style?): Unit {
      val fnPtr = _803445348_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__803445348_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGroupStyle2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __803445348_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupStyle2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69f906793a114fe7b4df2a0139d4018b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupStyle2(ptr: Pointer?): WithDefault = IGroupStyle2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupStyle2 {
      val address = segment.toRawLongValue()
      return makeIGroupStyle2(Pointer(address))
    }

    public override fun toNative(obj: IGroupStyle2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__803445348_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupStyle2): Array<IGroupStyle2?> = (elements as
        Array<IGroupStyle2?>).castToImpl<IGroupStyle2,IGroupStyle2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupStyle2?> =
        arrayOfNulls<IGroupStyle2_Impl>(size) as Array<IGroupStyle2?>
  }
}
