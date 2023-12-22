package Windows.Storage.BulkAccess

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Storage.FileProperties.BasicProperties
import Windows.Storage.FileProperties.DocumentProperties
import Windows.Storage.FileProperties.ImageProperties
import Windows.Storage.FileProperties.MusicProperties
import Windows.Storage.FileProperties.StorageItemThumbnail
import Windows.Storage.FileProperties.VideoProperties
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IStorageItemInformation.ABI::class)
@Signature("{87a5cb8b-8972-4f40-8de0-d86fb179d8fa}")
@Guid("87a5cb8b89724f408de0d86fb179d8fa")
@WinRTInterface("87a5cb8b89724f408de0d86fb179d8fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemInformation.ByReference::class)
public interface IStorageItemInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MusicProperties(): MusicProperties?

  @InterfaceMethod(1)
  public fun get_VideoProperties(): VideoProperties?

  @InterfaceMethod(2)
  public fun get_ImageProperties(): ImageProperties?

  @InterfaceMethod(3)
  public fun get_DocumentProperties(): DocumentProperties?

  @InterfaceMethod(4)
  public fun get_BasicProperties(): BasicProperties?

  @InterfaceMethod(5)
  public fun get_Thumbnail(): StorageItemThumbnail?

  @InterfaceMethod(6)
  public fun add_ThumbnailUpdated(changedHandler: TypedEventHandler<IStorageItemInformation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ThumbnailUpdated(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PropertiesUpdated(changedHandler: TypedEventHandler<IStorageItemInformation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PropertiesUpdated(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemInformation> {
    public override fun getValue() = ABI.makeIStorageItemInformation(pointer.getPointer(0))

    public fun setValue(value: IStorageItemInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemInformation {
    public val __1258609971_Ptr: Pointer?

    public val _1258609971_VtblPtr: Pointer?
      get() = __1258609971_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MusicProperties(): MusicProperties? {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MusicProperties>()
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MusicProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoProperties(): VideoProperties? {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoProperties>()
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ImageProperties(): ImageProperties? {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageProperties>()
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DocumentProperties(): DocumentProperties? {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DocumentProperties>()
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DocumentProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_BasicProperties(): BasicProperties? {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BasicProperties>()
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BasicProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Thumbnail(): StorageItemThumbnail? {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageItemThumbnail>()
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageItemThumbnail>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override
        fun add_ThumbnailUpdated(changedHandler: TypedEventHandler<IStorageItemInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr, marshalToNative(changedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ThumbnailUpdated(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun add_PropertiesUpdated(changedHandler: TypedEventHandler<IStorageItemInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr, marshalToNative(changedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PropertiesUpdated(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1258609971_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1258609971_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageItemInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1258609971_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87a5cb8b89724f408de0d86fb179d8fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemInformation(ptr: Pointer?): WithDefault =
        IStorageItemInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemInformation {
      val address = segment.toRawLongValue()
      return makeIStorageItemInformation(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1258609971_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemInformation): Array<IStorageItemInformation?>
        = (elements as
        Array<IStorageItemInformation?>).castToImpl<IStorageItemInformation,IStorageItemInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemInformation?> =
        arrayOfNulls<IStorageItemInformation_Impl>(size) as Array<IStorageItemInformation?>
  }
}
