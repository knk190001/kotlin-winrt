package Windows.Management.Update

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPreviewBuildsManager.ABI::class)
@Signature("{fa07dd61-7e4f-59f7-7c9f-def9051c5f62}")
@Guid("fa07dd617e4f59f77c9fdef9051c5f62")
@WinRTInterface("fa07dd617e4f59f77c9fdef9051c5f62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPreviewBuildsManager.ByReference::class)
public interface IPreviewBuildsManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ArePreviewBuildsAllowed(): Boolean

  @InterfaceMethod(1)
  public fun put_ArePreviewBuildsAllowed(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetCurrentState(): PreviewBuildsState?

  @InterfaceMethod(3)
  public fun SyncAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPreviewBuildsManager> {
    public override fun getValue() = ABI.makeIPreviewBuildsManager(pointer.getPointer(0))

    public fun setValue(value: IPreviewBuildsManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPreviewBuildsManager {
    public val __861963456_Ptr: Pointer?

    public val _861963456_VtblPtr: Pointer?
      get() = __861963456_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ArePreviewBuildsAllowed(): Boolean {
      val fnPtr = _861963456_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__861963456_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ArePreviewBuildsAllowed(value: Boolean): Unit {
      val fnPtr = _861963456_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__861963456_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetCurrentState(): PreviewBuildsState? {
      val fnPtr = _861963456_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PreviewBuildsState>()
      val hr = fn.invokeHR(arrayOf(__861963456_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PreviewBuildsState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SyncAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _861963456_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__861963456_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPreviewBuildsManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __861963456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPreviewBuildsManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa07dd617e4f59f77c9fdef9051c5f62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPreviewBuildsManager(ptr: Pointer?): WithDefault =
        IPreviewBuildsManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPreviewBuildsManager {
      val address = segment.toRawLongValue()
      return makeIPreviewBuildsManager(Pointer(address))
    }

    public override fun toNative(obj: IPreviewBuildsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__861963456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPreviewBuildsManager): Array<IPreviewBuildsManager?> =
        (elements as
        Array<IPreviewBuildsManager?>).castToImpl<IPreviewBuildsManager,IPreviewBuildsManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPreviewBuildsManager?> =
        arrayOfNulls<IPreviewBuildsManager_Impl>(size) as Array<IPreviewBuildsManager?>
  }
}
