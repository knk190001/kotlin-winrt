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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IFrameIsoSpeedCapabilities.ABI::class)
@Signature("{16bdff61-6df6-4ac9-b92a-9f6ecd1ad2fa}")
@Guid("16bdff616df64ac9b92a9f6ecd1ad2fa")
@WinRTInterface("16bdff616df64ac9b92a9f6ecd1ad2fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameIsoSpeedCapabilities.ByReference::class)
public interface IFrameIsoSpeedCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_Min(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Max(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_Step(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameIsoSpeedCapabilities> {
    public override fun getValue() = ABI.makeIFrameIsoSpeedCapabilities(pointer.getPointer(0))

    public fun setValue(value: IFrameIsoSpeedCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameIsoSpeedCapabilities {
    public val __878757313_Ptr: Pointer?

    public val _878757313_VtblPtr: Pointer?
      get() = __878757313_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _878757313_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__878757313_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Min(): WinDef.UINT {
      val fnPtr = _878757313_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__878757313_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Max(): WinDef.UINT {
      val fnPtr = _878757313_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__878757313_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Step(): WinDef.UINT {
      val fnPtr = _878757313_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__878757313_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrameIsoSpeedCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __878757313_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameIsoSpeedCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16bdff616df64ac9b92a9f6ecd1ad2fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameIsoSpeedCapabilities(ptr: Pointer?): WithDefault =
        IFrameIsoSpeedCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameIsoSpeedCapabilities {
      val address = segment.toRawLongValue()
      return makeIFrameIsoSpeedCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IFrameIsoSpeedCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__878757313_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameIsoSpeedCapabilities):
        Array<IFrameIsoSpeedCapabilities?> = (elements as
        Array<IFrameIsoSpeedCapabilities?>).castToImpl<IFrameIsoSpeedCapabilities,IFrameIsoSpeedCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameIsoSpeedCapabilities?> =
        arrayOfNulls<IFrameIsoSpeedCapabilities_Impl>(size) as Array<IFrameIsoSpeedCapabilities?>
  }
}
