package Windows.UI.Xaml.Input

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

@ABIMarker(IGettingFocusEventArgs3.ABI::class)
@Signature("{4e024891-db3f-5e78-b75a-62bfc3510735}")
@Guid("4e024891db3f5e78b75a62bfc3510735")
@WinRTInterface("4e024891db3f5e78b75a62bfc3510735")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGettingFocusEventArgs3.ByReference::class)
public interface IGettingFocusEventArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGettingFocusEventArgs3> {
    public override fun getValue() = ABI.makeIGettingFocusEventArgs3(pointer.getPointer(0))

    public fun setValue(value: IGettingFocusEventArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGettingFocusEventArgs3 {
    public val __1689763302_Ptr: Pointer?

    public val _1689763302_VtblPtr: Pointer?
      get() = __1689763302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1689763302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1689763302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IGettingFocusEventArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1689763302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGettingFocusEventArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e024891db3f5e78b75a62bfc3510735")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGettingFocusEventArgs3(ptr: Pointer?): WithDefault =
        IGettingFocusEventArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGettingFocusEventArgs3 {
      val address = segment.toRawLongValue()
      return makeIGettingFocusEventArgs3(Pointer(address))
    }

    public override fun toNative(obj: IGettingFocusEventArgs3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1689763302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGettingFocusEventArgs3): Array<IGettingFocusEventArgs3?>
        = (elements as
        Array<IGettingFocusEventArgs3?>).castToImpl<IGettingFocusEventArgs3,IGettingFocusEventArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGettingFocusEventArgs3?> =
        arrayOfNulls<IGettingFocusEventArgs3_Impl>(size) as Array<IGettingFocusEventArgs3?>
  }
}
