package Windows.Media.Devices.Core

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

@ABIMarker(IFrameFlashCapabilities.ABI::class)
@Signature("{bb9341a2-5ebe-4f62-8223-0e2b05bfbbd0}")
@Guid("bb9341a25ebe4f6282230e2b05bfbbd0")
@WinRTInterface("bb9341a25ebe4f6282230e2b05bfbbd0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameFlashCapabilities.ByReference::class)
public interface IFrameFlashCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_RedEyeReductionSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_PowerSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameFlashCapabilities> {
    public override fun getValue() = ABI.makeIFrameFlashCapabilities(pointer.getPointer(0))

    public fun setValue(value: IFrameFlashCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameFlashCapabilities {
    public val __894161469_Ptr: Pointer?

    public val _894161469_VtblPtr: Pointer?
      get() = __894161469_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _894161469_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__894161469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_RedEyeReductionSupported(): Boolean {
      val fnPtr = _894161469_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__894161469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_PowerSupported(): Boolean {
      val fnPtr = _894161469_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__894161469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrameFlashCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __894161469_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameFlashCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb9341a25ebe4f6282230e2b05bfbbd0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameFlashCapabilities(ptr: Pointer?): WithDefault =
        IFrameFlashCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameFlashCapabilities {
      val address = segment.toRawLongValue()
      return makeIFrameFlashCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IFrameFlashCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__894161469_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameFlashCapabilities): Array<IFrameFlashCapabilities?>
        = (elements as
        Array<IFrameFlashCapabilities?>).castToImpl<IFrameFlashCapabilities,IFrameFlashCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameFlashCapabilities?> =
        arrayOfNulls<IFrameFlashCapabilities_Impl>(size) as Array<IFrameFlashCapabilities?>
  }
}
