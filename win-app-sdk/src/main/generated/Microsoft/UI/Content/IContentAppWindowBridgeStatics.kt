package Microsoft.UI.Content

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

@ABIMarker(IContentAppWindowBridgeStatics.ABI::class)
@Signature("{84b9cd9c-e822-5f12-b21d-31a409b804f5}")
@Guid("84b9cd9ce8225f12b21d31a409b804f5")
@WinRTInterface("84b9cd9ce8225f12b21d31a409b804f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentAppWindowBridgeStatics.ByReference::class)
public interface IContentAppWindowBridgeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForWindowId(childWindowId: WindowId?): ContentAppWindowBridge?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentAppWindowBridgeStatics> {
    public override fun getValue() = ABI.makeIContentAppWindowBridgeStatics(pointer.getPointer(0))

    public fun setValue(value: IContentAppWindowBridgeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentAppWindowBridgeStatics {
    public val __2054461958_Ptr: Pointer?

    public val _2054461958_VtblPtr: Pointer?
      get() = __2054461958_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForWindowId(childWindowId: WindowId?): ContentAppWindowBridge? {
      val fnPtr = _2054461958_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentAppWindowBridge>()
      val hr = fn.invokeHR(arrayOf(__2054461958_Ptr, marshalToNative(childWindowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentAppWindowBridge>(result.getValue())
      return resultValue
    }
  }

  public class IContentAppWindowBridgeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2054461958_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentAppWindowBridgeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84b9cd9ce8225f12b21d31a409b804f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentAppWindowBridgeStatics(ptr: Pointer?): WithDefault =
        IContentAppWindowBridgeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentAppWindowBridgeStatics {
      val address = segment.toRawLongValue()
      return makeIContentAppWindowBridgeStatics(Pointer(address))
    }

    public override fun toNative(obj: IContentAppWindowBridgeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2054461958_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentAppWindowBridgeStatics):
        Array<IContentAppWindowBridgeStatics?> = (elements as
        Array<IContentAppWindowBridgeStatics?>).castToImpl<IContentAppWindowBridgeStatics,IContentAppWindowBridgeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentAppWindowBridgeStatics?> =
        arrayOfNulls<IContentAppWindowBridgeStatics_Impl>(size) as
        Array<IContentAppWindowBridgeStatics?>
  }
}
