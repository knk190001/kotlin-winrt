package Windows.Media.Import

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportSource.ABI::class)
@Signature("{1f8ea35e-145b-4cd6-87f1-54965a982fef}")
@Guid("1f8ea35e145b4cd687f154965a982fef")
@WinRTInterface("1f8ea35e145b4cd687f154965a982fef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportSource.ByReference::class)
public interface IPhotoImportSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_Description(): String?

  @InterfaceMethod(3)
  public fun get_Manufacturer(): String?

  @InterfaceMethod(4)
  public fun get_Model(): String?

  @InterfaceMethod(5)
  public fun get_SerialNumber(): String?

  @InterfaceMethod(6)
  public fun get_ConnectionProtocol(): String?

  @InterfaceMethod(7)
  public fun get_ConnectionTransport(): PhotoImportConnectionTransport?

  @InterfaceMethod(8)
  public fun get_Type(): PhotoImportSourceType?

  @InterfaceMethod(9)
  public fun get_PowerSource(): PhotoImportPowerSource?

  @InterfaceMethod(10)
  public fun get_BatteryLevelPercent(): IReference<WinDef.UINT>?

  @InterfaceMethod(11)
  public fun get_DateTime(): IReference<DateTime?>?

  @InterfaceMethod(12)
  public fun get_StorageMedia(): IVectorView<PhotoImportStorageMedium?>?

  @InterfaceMethod(13)
  public fun get_IsLocked(): IReference<Boolean>?

  @InterfaceMethod(14)
  public fun get_IsMassStorage(): Boolean

  @InterfaceMethod(15)
  public fun get_Thumbnail(): IRandomAccessStreamReference?

  @InterfaceMethod(16)
  public fun CreateImportSession(): PhotoImportSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportSource> {
    public override fun getValue() = ABI.makeIPhotoImportSource(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportSource {
    public val __85996163_Ptr: Pointer?

    public val _85996163_VtblPtr: Pointer?
      get() = __85996163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Description(): String? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Manufacturer(): String? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Model(): String? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SerialNumber(): String? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ConnectionProtocol(): String? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ConnectionTransport(): PhotoImportConnectionTransport? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportConnectionTransport>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportConnectionTransport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Type(): PhotoImportSourceType? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSourceType>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSourceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PowerSource(): PhotoImportPowerSource? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportPowerSource>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportPowerSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_BatteryLevelPercent(): IReference<WinDef.UINT>? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_DateTime(): IReference<DateTime?>? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_StorageMedia(): IVectorView<PhotoImportStorageMedium?>? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhotoImportStorageMedium?>>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhotoImportStorageMedium?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_IsLocked(): IReference<Boolean>? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_IsMassStorage(): Boolean {
      val fnPtr = _85996163_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_Thumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun CreateImportSession(): PhotoImportSession? {
      val fnPtr = _85996163_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSession>()
      val hr = fn.invokeHR(arrayOf(__85996163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSession>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __85996163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f8ea35e145b4cd687f154965a982fef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportSource(ptr: Pointer?): WithDefault = IPhotoImportSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportSource {
      val address = segment.toRawLongValue()
      return makeIPhotoImportSource(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__85996163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportSource): Array<IPhotoImportSource?> =
        (elements as
        Array<IPhotoImportSource?>).castToImpl<IPhotoImportSource,IPhotoImportSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportSource?> =
        arrayOfNulls<IPhotoImportSource_Impl>(size) as Array<IPhotoImportSource?>
  }
}
