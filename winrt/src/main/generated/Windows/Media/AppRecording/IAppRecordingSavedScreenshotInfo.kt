package Windows.Media.AppRecording

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

@ABIMarker(IAppRecordingSavedScreenshotInfo.ABI::class)
@Signature("{9b642d0a-189a-4d00-bf25-e1bb1249d594}")
@Guid("9b642d0a189a4d00bf25e1bb1249d594")
@WinRTInterface("9b642d0a189a4d00bf25e1bb1249d594")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppRecordingSavedScreenshotInfo.ByReference::class)
public interface IAppRecordingSavedScreenshotInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_File(): StorageFile?

  @InterfaceMethod(1)
  public fun get_MediaEncodingSubtype(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppRecordingSavedScreenshotInfo> {
    public override fun getValue() = ABI.makeIAppRecordingSavedScreenshotInfo(pointer.getPointer(0))

    public fun setValue(value: IAppRecordingSavedScreenshotInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppRecordingSavedScreenshotInfo {
    public val __119371417_Ptr: Pointer?

    public val _119371417_VtblPtr: Pointer?
      get() = __119371417_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_File(): StorageFile? {
      val fnPtr = _119371417_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__119371417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaEncodingSubtype(): String? {
      val fnPtr = _119371417_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__119371417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppRecordingSavedScreenshotInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __119371417_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppRecordingSavedScreenshotInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b642d0a189a4d00bf25e1bb1249d594")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppRecordingSavedScreenshotInfo(ptr: Pointer?): WithDefault =
        IAppRecordingSavedScreenshotInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppRecordingSavedScreenshotInfo {
      val address = segment.toRawLongValue()
      return makeIAppRecordingSavedScreenshotInfo(Pointer(address))
    }

    public override fun toNative(obj: IAppRecordingSavedScreenshotInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__119371417_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppRecordingSavedScreenshotInfo):
        Array<IAppRecordingSavedScreenshotInfo?> = (elements as
        Array<IAppRecordingSavedScreenshotInfo?>).castToImpl<IAppRecordingSavedScreenshotInfo,IAppRecordingSavedScreenshotInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppRecordingSavedScreenshotInfo?> =
        arrayOfNulls<IAppRecordingSavedScreenshotInfo_Impl>(size) as
        Array<IAppRecordingSavedScreenshotInfo?>
  }
}
