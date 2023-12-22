package Windows.Storage.FileProperties

import Windows.Foundation.IAsyncOperation
import Windows.Storage.FileProperties.IStorageItemExtraProperties.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IStorageItemContentProperties.ABI::class)
@Signature("{05294bad-bc38-48bf-85d7-770e0e2ae0ba}")
@Guid("05294badbc3848bf85d7770e0e2ae0ba")
@WinRTInterface("05294badbc3848bf85d7770e0e2ae0ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemContentProperties.ByReference::class)
public interface IStorageItemContentProperties : NativeMapped, IWinRTInterface,
    IStorageItemExtraProperties {
  @InterfaceMethod(0)
  public fun GetMusicPropertiesAsync(): IAsyncOperation<MusicProperties?>?

  @InterfaceMethod(1)
  public fun GetVideoPropertiesAsync(): IAsyncOperation<VideoProperties?>?

  @InterfaceMethod(2)
  public fun GetImagePropertiesAsync(): IAsyncOperation<ImageProperties?>?

  @InterfaceMethod(3)
  public fun GetDocumentPropertiesAsync(): IAsyncOperation<DocumentProperties?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemContentProperties> {
    public override fun getValue() = ABI.makeIStorageItemContentProperties(pointer.getPointer(0))

    public fun setValue(value: IStorageItemContentProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemContentProperties,
      IStorageItemExtraProperties.WithDefault {
    public val __1760682042_Ptr: Pointer?

    public val _1760682042_VtblPtr: Pointer?
      get() = __1760682042_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetMusicPropertiesAsync(): IAsyncOperation<MusicProperties?>? {
      val fnPtr = _1760682042_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MusicProperties?>>()
      val hr = fn.invokeHR(arrayOf(__1760682042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MusicProperties?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetVideoPropertiesAsync(): IAsyncOperation<VideoProperties?>? {
      val fnPtr = _1760682042_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VideoProperties?>>()
      val hr = fn.invokeHR(arrayOf(__1760682042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VideoProperties?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetImagePropertiesAsync(): IAsyncOperation<ImageProperties?>? {
      val fnPtr = _1760682042_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ImageProperties?>>()
      val hr = fn.invokeHR(arrayOf(__1760682042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ImageProperties?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDocumentPropertiesAsync(): IAsyncOperation<DocumentProperties?>? {
      val fnPtr = _1760682042_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DocumentProperties?>>()
      val hr = fn.invokeHR(arrayOf(__1760682042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DocumentProperties?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageItemContentProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItemExtraProperties {
    public override val __1999536785_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1760682042_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1760682042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemContentProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05294badbc3848bf85d7770e0e2ae0ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemContentProperties(ptr: Pointer?): WithDefault =
        IStorageItemContentProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemContentProperties {
      val address = segment.toRawLongValue()
      return makeIStorageItemContentProperties(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemContentProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1760682042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemContentProperties):
        Array<IStorageItemContentProperties?> = (elements as
        Array<IStorageItemContentProperties?>).castToImpl<IStorageItemContentProperties,IStorageItemContentProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemContentProperties?> =
        arrayOfNulls<IStorageItemContentProperties_Impl>(size) as
        Array<IStorageItemContentProperties?>
  }
}
