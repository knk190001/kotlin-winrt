package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IContinuationActivatedEventArgs.ABI.IID
import Windows.Foundation.Collections.IVectorView
import Windows.Storage.StorageFile
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

@ABIMarker(IFileOpenPickerContinuationEventArgs.ABI::class)
@Signature("{f0fa3f3a-d4e8-4ad3-9c34-2308f32fcec9}")
@Guid("f0fa3f3ad4e84ad39c342308f32fcec9")
@WinRTInterface("f0fa3f3ad4e84ad39c342308f32fcec9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPickerContinuationEventArgs.ByReference::class)
public interface IFileOpenPickerContinuationEventArgs : NativeMapped, IWinRTInterface,
    IContinuationActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Files(): IVectorView<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPickerContinuationEventArgs> {
    public override fun getValue() =
        ABI.makeIFileOpenPickerContinuationEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPickerContinuationEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPickerContinuationEventArgs,
      IContinuationActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __680437565_Ptr: Pointer?

    public val _680437565_VtblPtr: Pointer?
      get() = __680437565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Files(): IVectorView<StorageFile?>? {
      val fnPtr = _680437565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__680437565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileOpenPickerContinuationEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContinuationActivatedEventArgs,
      IActivatedEventArgs {
    public override val __1151516762_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_680437565_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_680437565_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __680437565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPickerContinuationEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0fa3f3ad4e84ad39c342308f32fcec9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPickerContinuationEventArgs(ptr: Pointer?): WithDefault =
        IFileOpenPickerContinuationEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPickerContinuationEventArgs {
      val address = segment.toRawLongValue()
      return makeIFileOpenPickerContinuationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPickerContinuationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__680437565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPickerContinuationEventArgs):
        Array<IFileOpenPickerContinuationEventArgs?> = (elements as
        Array<IFileOpenPickerContinuationEventArgs?>).castToImpl<IFileOpenPickerContinuationEventArgs,IFileOpenPickerContinuationEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPickerContinuationEventArgs?> =
        arrayOfNulls<IFileOpenPickerContinuationEventArgs_Impl>(size) as
        Array<IFileOpenPickerContinuationEventArgs?>
  }
}
