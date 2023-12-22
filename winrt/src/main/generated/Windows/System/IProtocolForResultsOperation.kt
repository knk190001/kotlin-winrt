package Windows.System

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IProtocolForResultsOperation.ABI::class)
@Signature("{d581293a-6de9-4d28-9378-f86782e182bb}")
@Guid("d581293a6de94d289378f86782e182bb")
@WinRTInterface("d581293a6de94d289378f86782e182bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtocolForResultsOperation.ByReference::class)
public interface IProtocolForResultsOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportCompleted(`data`: ValueSet?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtocolForResultsOperation> {
    public override fun getValue() = ABI.makeIProtocolForResultsOperation(pointer.getPointer(0))

    public fun setValue(value: IProtocolForResultsOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtocolForResultsOperation {
    public val __598301299_Ptr: Pointer?

    public val _598301299_VtblPtr: Pointer?
      get() = __598301299_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportCompleted(`data`: ValueSet?): Unit {
      val fnPtr = _598301299_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__598301299_Ptr, marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IProtocolForResultsOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __598301299_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtocolForResultsOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d581293a6de94d289378f86782e182bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtocolForResultsOperation(ptr: Pointer?): WithDefault =
        IProtocolForResultsOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtocolForResultsOperation {
      val address = segment.toRawLongValue()
      return makeIProtocolForResultsOperation(Pointer(address))
    }

    public override fun toNative(obj: IProtocolForResultsOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__598301299_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtocolForResultsOperation):
        Array<IProtocolForResultsOperation?> = (elements as
        Array<IProtocolForResultsOperation?>).castToImpl<IProtocolForResultsOperation,IProtocolForResultsOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtocolForResultsOperation?> =
        arrayOfNulls<IProtocolForResultsOperation_Impl>(size) as
        Array<IProtocolForResultsOperation?>
  }
}
