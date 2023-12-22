package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IContinuationActivatedEventArgs.ABI.IID
import Windows.Storage.StorageFolder
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

@ABIMarker(IFolderPickerContinuationEventArgs.ABI::class)
@Signature("{51882366-9f4b-498f-beb0-42684f6e1c29}")
@Guid("518823669f4b498fbeb042684f6e1c29")
@WinRTInterface("518823669f4b498fbeb042684f6e1c29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFolderPickerContinuationEventArgs.ByReference::class)
public interface IFolderPickerContinuationEventArgs : NativeMapped, IWinRTInterface,
    IContinuationActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Folder(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFolderPickerContinuationEventArgs> {
    public override fun getValue() =
        ABI.makeIFolderPickerContinuationEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFolderPickerContinuationEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFolderPickerContinuationEventArgs,
      IContinuationActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __371163899_Ptr: Pointer?

    public val _371163899_VtblPtr: Pointer?
      get() = __371163899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Folder(): StorageFolder? {
      val fnPtr = _371163899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__371163899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IFolderPickerContinuationEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContinuationActivatedEventArgs,
      IActivatedEventArgs {
    public override val __1151516762_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_371163899_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_371163899_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __371163899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFolderPickerContinuationEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("518823669f4b498fbeb042684f6e1c29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFolderPickerContinuationEventArgs(ptr: Pointer?): WithDefault =
        IFolderPickerContinuationEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFolderPickerContinuationEventArgs {
      val address = segment.toRawLongValue()
      return makeIFolderPickerContinuationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFolderPickerContinuationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__371163899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFolderPickerContinuationEventArgs):
        Array<IFolderPickerContinuationEventArgs?> = (elements as
        Array<IFolderPickerContinuationEventArgs?>).castToImpl<IFolderPickerContinuationEventArgs,IFolderPickerContinuationEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFolderPickerContinuationEventArgs?> =
        arrayOfNulls<IFolderPickerContinuationEventArgs_Impl>(size) as
        Array<IFolderPickerContinuationEventArgs?>
  }
}
