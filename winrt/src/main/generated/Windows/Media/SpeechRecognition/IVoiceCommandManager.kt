package Windows.Media.SpeechRecognition

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncAction
import Windows.Storage.StorageFile
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVoiceCommandManager.ABI::class)
@Signature("{aa3a8dd5-b6e7-4ee2-baa9-dd6baced0a2b}")
@Guid("aa3a8dd5b6e74ee2baa9dd6baced0a2b")
@WinRTInterface("aa3a8dd5b6e74ee2baa9dd6baced0a2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandManager.ByReference::class)
public interface IVoiceCommandManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InstallCommandSetsFromStorageFileAsync(`file`: StorageFile?): IAsyncAction?

  @InterfaceMethod(1)
  public fun get_InstalledCommandSets(): IMapView<String?, VoiceCommandSet?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandManager> {
    public override fun getValue() = ABI.makeIVoiceCommandManager(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandManager {
    public val __1051453493_Ptr: Pointer?

    public val _1051453493_VtblPtr: Pointer?
      get() = __1051453493_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InstallCommandSetsFromStorageFileAsync(`file`: StorageFile?):
        IAsyncAction? {
      val fnPtr = _1051453493_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1051453493_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InstalledCommandSets(): IMapView<String?, VoiceCommandSet?>? {
      val fnPtr = _1051453493_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, VoiceCommandSet?>>()
      val hr = fn.invokeHR(arrayOf(__1051453493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, VoiceCommandSet?>>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommandManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1051453493_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa3a8dd5b6e74ee2baa9dd6baced0a2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandManager(ptr: Pointer?): WithDefault = IVoiceCommandManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandManager {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandManager(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1051453493_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandManager): Array<IVoiceCommandManager?> =
        (elements as
        Array<IVoiceCommandManager?>).castToImpl<IVoiceCommandManager,IVoiceCommandManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandManager?> =
        arrayOfNulls<IVoiceCommandManager_Impl>(size) as Array<IVoiceCommandManager?>
  }
}
