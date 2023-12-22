package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBarcodeScannerPreviewActivatedEventArgs.ABI::class)
@Signature("{6772797c-99bf-4349-af22-e4123560371c}")
@Guid("6772797c99bf4349af22e4123560371c")
@WinRTInterface("6772797c99bf4349af22e4123560371c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerPreviewActivatedEventArgs.ByReference::class)
public interface IBarcodeScannerPreviewActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ConnectionId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerPreviewActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerPreviewActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerPreviewActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerPreviewActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __627301063_Ptr: Pointer?

    public val _627301063_VtblPtr: Pointer?
      get() = __627301063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConnectionId(): String? {
      val fnPtr = _627301063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__627301063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerPreviewActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_627301063_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __627301063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerPreviewActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6772797c99bf4349af22e4123560371c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerPreviewActivatedEventArgs(ptr: Pointer?): WithDefault =
        IBarcodeScannerPreviewActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerPreviewActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerPreviewActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerPreviewActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__627301063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerPreviewActivatedEventArgs):
        Array<IBarcodeScannerPreviewActivatedEventArgs?> = (elements as
        Array<IBarcodeScannerPreviewActivatedEventArgs?>).castToImpl<IBarcodeScannerPreviewActivatedEventArgs,IBarcodeScannerPreviewActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerPreviewActivatedEventArgs?> =
        arrayOfNulls<IBarcodeScannerPreviewActivatedEventArgs_Impl>(size) as
        Array<IBarcodeScannerPreviewActivatedEventArgs?>
  }
}
