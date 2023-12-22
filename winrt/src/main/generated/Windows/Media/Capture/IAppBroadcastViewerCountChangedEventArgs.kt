package Windows.Media.Capture

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastViewerCountChangedEventArgs.ABI::class)
@Signature("{e6e11825-5401-4ade-8bd2-c14ecee6807d}")
@Guid("e6e1182554014ade8bd2c14ecee6807d")
@WinRTInterface("e6e1182554014ade8bd2c14ecee6807d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastViewerCountChangedEventArgs.ByReference::class)
public interface IAppBroadcastViewerCountChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViewerCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastViewerCountChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppBroadcastViewerCountChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastViewerCountChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastViewerCountChangedEventArgs {
    public val __840355864_Ptr: Pointer?

    public val _840355864_VtblPtr: Pointer?
      get() = __840355864_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewerCount(): WinDef.UINT {
      val fnPtr = _840355864_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__840355864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastViewerCountChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __840355864_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastViewerCountChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6e1182554014ade8bd2c14ecee6807d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastViewerCountChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppBroadcastViewerCountChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastViewerCountChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastViewerCountChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastViewerCountChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__840355864_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastViewerCountChangedEventArgs):
        Array<IAppBroadcastViewerCountChangedEventArgs?> = (elements as
        Array<IAppBroadcastViewerCountChangedEventArgs?>).castToImpl<IAppBroadcastViewerCountChangedEventArgs,IAppBroadcastViewerCountChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastViewerCountChangedEventArgs?> =
        arrayOfNulls<IAppBroadcastViewerCountChangedEventArgs_Impl>(size) as
        Array<IAppBroadcastViewerCountChangedEventArgs?>
  }
}
