package Windows.ApplicationModel.Preview.InkWorkspace

import Windows.Foundation.IAsyncAction
import Windows.Graphics.Imaging.SoftwareBitmap
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

@ABIMarker(IInkWorkspaceHostedAppManager.ABI::class)
@Signature("{fe0a7990-5e59-4bb7-8a63-7d218cd96300}")
@Guid("fe0a79905e594bb78a637d218cd96300")
@WinRTInterface("fe0a79905e594bb78a637d218cd96300")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkWorkspaceHostedAppManager.ByReference::class)
public interface IInkWorkspaceHostedAppManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetThumbnailAsync(bitmap: SoftwareBitmap?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkWorkspaceHostedAppManager> {
    public override fun getValue() = ABI.makeIInkWorkspaceHostedAppManager(pointer.getPointer(0))

    public fun setValue(value: IInkWorkspaceHostedAppManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkWorkspaceHostedAppManager {
    public val __1802966284_Ptr: Pointer?

    public val _1802966284_VtblPtr: Pointer?
      get() = __1802966284_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetThumbnailAsync(bitmap: SoftwareBitmap?): IAsyncAction? {
      val fnPtr = _1802966284_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1802966284_Ptr, marshalToNative(bitmap), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IInkWorkspaceHostedAppManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1802966284_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkWorkspaceHostedAppManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe0a79905e594bb78a637d218cd96300")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkWorkspaceHostedAppManager(ptr: Pointer?): WithDefault =
        IInkWorkspaceHostedAppManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkWorkspaceHostedAppManager {
      val address = segment.toRawLongValue()
      return makeIInkWorkspaceHostedAppManager(Pointer(address))
    }

    public override fun toNative(obj: IInkWorkspaceHostedAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1802966284_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkWorkspaceHostedAppManager):
        Array<IInkWorkspaceHostedAppManager?> = (elements as
        Array<IInkWorkspaceHostedAppManager?>).castToImpl<IInkWorkspaceHostedAppManager,IInkWorkspaceHostedAppManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkWorkspaceHostedAppManager?> =
        arrayOfNulls<IInkWorkspaceHostedAppManager_Impl>(size) as
        Array<IInkWorkspaceHostedAppManager?>
  }
}
