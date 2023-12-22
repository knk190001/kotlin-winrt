package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.System.ProtocolForResultsOperation
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

@ABIMarker(IProtocolForResultsActivatedEventArgs.ABI::class)
@Signature("{e75132c2-7ae7-4517-80ac-dbe8d7cc5b9c}")
@Guid("e75132c27ae7451780acdbe8d7cc5b9c")
@WinRTInterface("e75132c27ae7451780acdbe8d7cc5b9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtocolForResultsActivatedEventArgs.ByReference::class)
public interface IProtocolForResultsActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ProtocolForResultsOperation(): ProtocolForResultsOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtocolForResultsActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIProtocolForResultsActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IProtocolForResultsActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtocolForResultsActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __1559543508_Ptr: Pointer?

    public val _1559543508_VtblPtr: Pointer?
      get() = __1559543508_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProtocolForResultsOperation(): ProtocolForResultsOperation? {
      val fnPtr = _1559543508_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtocolForResultsOperation>()
      val hr = fn.invokeHR(arrayOf(__1559543508_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtocolForResultsOperation>(result.getValue())
      return resultValue
    }
  }

  public class IProtocolForResultsActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1559543508_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1559543508_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtocolForResultsActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e75132c27ae7451780acdbe8d7cc5b9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtocolForResultsActivatedEventArgs(ptr: Pointer?): WithDefault =
        IProtocolForResultsActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtocolForResultsActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIProtocolForResultsActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IProtocolForResultsActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1559543508_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtocolForResultsActivatedEventArgs):
        Array<IProtocolForResultsActivatedEventArgs?> = (elements as
        Array<IProtocolForResultsActivatedEventArgs?>).castToImpl<IProtocolForResultsActivatedEventArgs,IProtocolForResultsActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtocolForResultsActivatedEventArgs?> =
        arrayOfNulls<IProtocolForResultsActivatedEventArgs_Impl>(size) as
        Array<IProtocolForResultsActivatedEventArgs?>
  }
}
