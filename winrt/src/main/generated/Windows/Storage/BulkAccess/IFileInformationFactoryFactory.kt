package Windows.Storage.BulkAccess

import Windows.Storage.FileProperties.ThumbnailMode
import Windows.Storage.FileProperties.ThumbnailOptions
import Windows.Storage.Search.IStorageQueryResultBase
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileInformationFactoryFactory.ABI::class)
@Signature("{84ea0e7d-e4a2-4f00-8afa-af5e0f826bd5}")
@Guid("84ea0e7de4a24f008afaaf5e0f826bd5")
@WinRTInterface("84ea0e7de4a24f008afaaf5e0f826bd5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileInformationFactoryFactory.ByReference::class)
public interface IFileInformationFactoryFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithMode(queryResult: IStorageQueryResultBase?, mode: ThumbnailMode?):
      FileInformationFactory?

  @InterfaceMethod(1)
  public fun CreateWithModeAndSize(
    queryResult: IStorageQueryResultBase?,
    mode: ThumbnailMode?,
    requestedThumbnailSize: WinDef.UINT
  ): FileInformationFactory?

  @InterfaceMethod(2)
  public fun CreateWithModeAndSizeAndOptions(
    queryResult: IStorageQueryResultBase?,
    mode: ThumbnailMode?,
    requestedThumbnailSize: WinDef.UINT,
    thumbnailOptions: ThumbnailOptions?
  ): FileInformationFactory?

  @InterfaceMethod(3)
  public fun CreateWithModeAndSizeAndOptionsAndFlags(
    queryResult: IStorageQueryResultBase?,
    mode: ThumbnailMode?,
    requestedThumbnailSize: WinDef.UINT,
    thumbnailOptions: ThumbnailOptions?,
    delayLoad: Boolean
  ): FileInformationFactory?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileInformationFactoryFactory> {
    public override fun getValue() = ABI.makeIFileInformationFactoryFactory(pointer.getPointer(0))

    public fun setValue(value: IFileInformationFactoryFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileInformationFactoryFactory {
    public val __1298748443_Ptr: Pointer?

    public val _1298748443_VtblPtr: Pointer?
      get() = __1298748443_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithMode(queryResult: IStorageQueryResultBase?, mode: ThumbnailMode?):
        FileInformationFactory? {
      val fnPtr = _1298748443_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileInformationFactory>()
      val hr = fn.invokeHR(arrayOf(__1298748443_Ptr, marshalToNative(queryResult),
          marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileInformationFactory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithModeAndSize(
      queryResult: IStorageQueryResultBase?,
      mode: ThumbnailMode?,
      requestedThumbnailSize: WinDef.UINT
    ): FileInformationFactory? {
      val fnPtr = _1298748443_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileInformationFactory>()
      val hr = fn.invokeHR(arrayOf(__1298748443_Ptr, marshalToNative(queryResult),
          marshalToNative(mode), requestedThumbnailSize, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileInformationFactory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithModeAndSizeAndOptions(
      queryResult: IStorageQueryResultBase?,
      mode: ThumbnailMode?,
      requestedThumbnailSize: WinDef.UINT,
      thumbnailOptions: ThumbnailOptions?
    ): FileInformationFactory? {
      val fnPtr = _1298748443_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileInformationFactory>()
      val hr = fn.invokeHR(arrayOf(__1298748443_Ptr, marshalToNative(queryResult),
          marshalToNative(mode), requestedThumbnailSize, marshalToNative(thumbnailOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileInformationFactory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateWithModeAndSizeAndOptionsAndFlags(
      queryResult: IStorageQueryResultBase?,
      mode: ThumbnailMode?,
      requestedThumbnailSize: WinDef.UINT,
      thumbnailOptions: ThumbnailOptions?,
      delayLoad: Boolean
    ): FileInformationFactory? {
      val fnPtr = _1298748443_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileInformationFactory>()
      val hr = fn.invokeHR(arrayOf(__1298748443_Ptr, marshalToNative(queryResult),
          marshalToNative(mode), requestedThumbnailSize, marshalToNative(thumbnailOptions),
          delayLoad, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileInformationFactory>(result.getValue())
      return resultValue
    }
  }

  public class IFileInformationFactoryFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1298748443_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileInformationFactoryFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84ea0e7de4a24f008afaaf5e0f826bd5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileInformationFactoryFactory(ptr: Pointer?): WithDefault =
        IFileInformationFactoryFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileInformationFactoryFactory {
      val address = segment.toRawLongValue()
      return makeIFileInformationFactoryFactory(Pointer(address))
    }

    public override fun toNative(obj: IFileInformationFactoryFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1298748443_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileInformationFactoryFactory):
        Array<IFileInformationFactoryFactory?> = (elements as
        Array<IFileInformationFactoryFactory?>).castToImpl<IFileInformationFactoryFactory,IFileInformationFactoryFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileInformationFactoryFactory?> =
        arrayOfNulls<IFileInformationFactoryFactory_Impl>(size) as
        Array<IFileInformationFactoryFactory?>
  }
}
