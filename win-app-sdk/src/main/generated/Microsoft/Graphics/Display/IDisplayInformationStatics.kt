package Microsoft.Graphics.Display

import Microsoft.UI.DisplayId
import Microsoft.UI.WindowId
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

@ABIMarker(IDisplayInformationStatics.ABI::class)
@Signature("{2de85048-37fa-56c0-ac30-47e2044d7ea8}")
@Guid("2de8504837fa56c0ac3047e2044d7ea8")
@WinRTInterface("2de8504837fa56c0ac3047e2044d7ea8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayInformationStatics.ByReference::class)
public interface IDisplayInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForWindowId(windowId: WindowId?): DisplayInformation?

  @InterfaceMethod(1)
  public fun CreateForDisplayId(displayId: DisplayId?): DisplayInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayInformationStatics> {
    public override fun getValue() = ABI.makeIDisplayInformationStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayInformationStatics {
    public val __742407727_Ptr: Pointer?

    public val _742407727_VtblPtr: Pointer?
      get() = __742407727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForWindowId(windowId: WindowId?): DisplayInformation? {
      val fnPtr = _742407727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayInformation>()
      val hr = fn.invokeHR(arrayOf(__742407727_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateForDisplayId(displayId: DisplayId?): DisplayInformation? {
      val fnPtr = _742407727_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayInformation>()
      val hr = fn.invokeHR(arrayOf(__742407727_Ptr, marshalToNative(displayId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayInformation>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __742407727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2de8504837fa56c0ac3047e2044d7ea8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayInformationStatics(ptr: Pointer?): WithDefault =
        IDisplayInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayInformationStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__742407727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayInformationStatics):
        Array<IDisplayInformationStatics?> = (elements as
        Array<IDisplayInformationStatics?>).castToImpl<IDisplayInformationStatics,IDisplayInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayInformationStatics?> =
        arrayOfNulls<IDisplayInformationStatics_Impl>(size) as Array<IDisplayInformationStatics?>
  }
}
