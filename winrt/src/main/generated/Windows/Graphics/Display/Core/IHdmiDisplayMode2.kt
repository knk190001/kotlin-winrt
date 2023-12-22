package Windows.Graphics.Display.Core

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHdmiDisplayMode2.ABI::class)
@Signature("{07cd4e9f-4b3c-42b8-84e7-895368718af2}")
@Guid("07cd4e9f4b3c42b884e7895368718af2")
@WinRTInterface("07cd4e9f4b3c42b884e7895368718af2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHdmiDisplayMode2.ByReference::class)
public interface IHdmiDisplayMode2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDolbyVisionLowLatencySupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHdmiDisplayMode2> {
    public override fun getValue() = ABI.makeIHdmiDisplayMode2(pointer.getPointer(0))

    public fun setValue(value: IHdmiDisplayMode2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHdmiDisplayMode2 {
    public val __1632661205_Ptr: Pointer?

    public val _1632661205_VtblPtr: Pointer?
      get() = __1632661205_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDolbyVisionLowLatencySupported(): Boolean {
      val fnPtr = _1632661205_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1632661205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHdmiDisplayMode2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1632661205_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHdmiDisplayMode2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07cd4e9f4b3c42b884e7895368718af2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHdmiDisplayMode2(ptr: Pointer?): WithDefault = IHdmiDisplayMode2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHdmiDisplayMode2 {
      val address = segment.toRawLongValue()
      return makeIHdmiDisplayMode2(Pointer(address))
    }

    public override fun toNative(obj: IHdmiDisplayMode2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1632661205_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHdmiDisplayMode2): Array<IHdmiDisplayMode2?> = (elements
        as Array<IHdmiDisplayMode2?>).castToImpl<IHdmiDisplayMode2,IHdmiDisplayMode2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHdmiDisplayMode2?> =
        arrayOfNulls<IHdmiDisplayMode2_Impl>(size) as Array<IHdmiDisplayMode2?>
  }
}
