package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.ILaunchActivatedEventArgs.ABI.IID
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

@ABIMarker(IDialReceiverActivatedEventArgs.ABI::class)
@Signature("{fb777ed7-85ee-456e-a44d-85d730e70aed}")
@Guid("fb777ed785ee456ea44d85d730e70aed")
@WinRTInterface("fb777ed785ee456ea44d85d730e70aed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialReceiverActivatedEventArgs.ByReference::class)
public interface IDialReceiverActivatedEventArgs : NativeMapped, IWinRTInterface,
    ILaunchActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_AppName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialReceiverActivatedEventArgs> {
    public override fun getValue() = ABI.makeIDialReceiverActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDialReceiverActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialReceiverActivatedEventArgs,
      ILaunchActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __1708290286_Ptr: Pointer?

    public val _1708290286_VtblPtr: Pointer?
      get() = __1708290286_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppName(): String? {
      val fnPtr = _1708290286_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1708290286_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDialReceiverActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ILaunchActivatedEventArgs,
      IActivatedEventArgs {
    public override val __183308062_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1708290286_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1708290286_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1708290286_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialReceiverActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb777ed785ee456ea44d85d730e70aed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialReceiverActivatedEventArgs(ptr: Pointer?): WithDefault =
        IDialReceiverActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialReceiverActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDialReceiverActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDialReceiverActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1708290286_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialReceiverActivatedEventArgs):
        Array<IDialReceiverActivatedEventArgs?> = (elements as
        Array<IDialReceiverActivatedEventArgs?>).castToImpl<IDialReceiverActivatedEventArgs,IDialReceiverActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialReceiverActivatedEventArgs?> =
        arrayOfNulls<IDialReceiverActivatedEventArgs_Impl>(size) as
        Array<IDialReceiverActivatedEventArgs?>
  }
}
