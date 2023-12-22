package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IFileActivatedEventArgs.ABI.IID
import Windows.Storage.Search.StorageFileQueryResult
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

@ABIMarker(IFileActivatedEventArgsWithNeighboringFiles.ABI::class)
@Signature("{433ba1a4-e1e2-48fd-b7fc-b5d6eee65033}")
@Guid("433ba1a4e1e248fdb7fcb5d6eee65033")
@WinRTInterface("433ba1a4e1e248fdb7fcb5d6eee65033")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileActivatedEventArgsWithNeighboringFiles.ByReference::class)
public interface IFileActivatedEventArgsWithNeighboringFiles : NativeMapped, IWinRTInterface,
    IFileActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_NeighboringFilesQuery(): StorageFileQueryResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileActivatedEventArgsWithNeighboringFiles> {
    public override fun getValue() =
        ABI.makeIFileActivatedEventArgsWithNeighboringFiles(pointer.getPointer(0))

    public fun setValue(value: IFileActivatedEventArgsWithNeighboringFiles_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileActivatedEventArgsWithNeighboringFiles,
      IFileActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __93781288_Ptr: Pointer?

    public val _93781288_VtblPtr: Pointer?
      get() = __93781288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NeighboringFilesQuery(): StorageFileQueryResult? {
      val fnPtr = _93781288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFileQueryResult>()
      val hr = fn.invokeHR(arrayOf(__93781288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFileQueryResult>(result.getValue())
      return resultValue
    }
  }

  public class IFileActivatedEventArgsWithNeighboringFiles_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IFileActivatedEventArgs,
      IActivatedEventArgs {
    public override val __136556715_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_93781288_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_93781288_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __93781288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileActivatedEventArgsWithNeighboringFiles, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("433ba1a4e1e248fdb7fcb5d6eee65033")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileActivatedEventArgsWithNeighboringFiles(ptr: Pointer?): WithDefault =
        IFileActivatedEventArgsWithNeighboringFiles_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IFileActivatedEventArgsWithNeighboringFiles {
      val address = segment.toRawLongValue()
      return makeIFileActivatedEventArgsWithNeighboringFiles(Pointer(address))
    }

    public override fun toNative(obj: IFileActivatedEventArgsWithNeighboringFiles): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__93781288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileActivatedEventArgsWithNeighboringFiles):
        Array<IFileActivatedEventArgsWithNeighboringFiles?> = (elements as
        Array<IFileActivatedEventArgsWithNeighboringFiles?>).castToImpl<IFileActivatedEventArgsWithNeighboringFiles,IFileActivatedEventArgsWithNeighboringFiles_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileActivatedEventArgsWithNeighboringFiles?> =
        arrayOfNulls<IFileActivatedEventArgsWithNeighboringFiles_Impl>(size) as
        Array<IFileActivatedEventArgsWithNeighboringFiles?>
  }
}
