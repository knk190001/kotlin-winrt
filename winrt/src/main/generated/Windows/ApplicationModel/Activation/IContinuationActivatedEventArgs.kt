package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IContinuationActivatedEventArgs.ABI::class)
@Signature("{e58106b5-155f-4a94-a742-c7e08f4e188c}")
@Guid("e58106b5155f4a94a742c7e08f4e188c")
@WinRTInterface("e58106b5155f4a94a742c7e08f4e188c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContinuationActivatedEventArgs.ByReference::class)
public interface IContinuationActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ContinuationData(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContinuationActivatedEventArgs> {
    public override fun getValue() = ABI.makeIContinuationActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContinuationActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContinuationActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __1151516762_Ptr: Pointer?

    public val _1151516762_VtblPtr: Pointer?
      get() = __1151516762_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContinuationData(): ValueSet? {
      val fnPtr = _1151516762_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1151516762_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IContinuationActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1151516762_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1151516762_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContinuationActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e58106b5155f4a94a742c7e08f4e188c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContinuationActivatedEventArgs(ptr: Pointer?): WithDefault =
        IContinuationActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContinuationActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContinuationActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContinuationActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1151516762_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContinuationActivatedEventArgs):
        Array<IContinuationActivatedEventArgs?> = (elements as
        Array<IContinuationActivatedEventArgs?>).castToImpl<IContinuationActivatedEventArgs,IContinuationActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContinuationActivatedEventArgs?> =
        arrayOfNulls<IContinuationActivatedEventArgs_Impl>(size) as
        Array<IContinuationActivatedEventArgs?>
  }
}
