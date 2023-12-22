package Windows.Storage.Pickers

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

@ABIMarker(IFileOpenPicker2.ABI::class)
@Signature("{8ceb6cd2-b446-46f7-b265-90f8e55ad650}")
@Guid("8ceb6cd2b44646f7b26590f8e55ad650")
@WinRTInterface("8ceb6cd2b44646f7b26590f8e55ad650")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPicker2.ByReference::class)
public interface IFileOpenPicker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContinuationData(): ValueSet?

  @InterfaceMethod(1)
  public fun PickSingleFileAndContinue(): Unit

  @InterfaceMethod(2)
  public fun PickMultipleFilesAndContinue(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPicker2> {
    public override fun getValue() = ABI.makeIFileOpenPicker2(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPicker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPicker2 {
    public val __1794071940_Ptr: Pointer?

    public val _1794071940_VtblPtr: Pointer?
      get() = __1794071940_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContinuationData(): ValueSet? {
      val fnPtr = _1794071940_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1794071940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PickSingleFileAndContinue(): Unit {
      val fnPtr = _1794071940_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794071940_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun PickMultipleFilesAndContinue(): Unit {
      val fnPtr = _1794071940_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794071940_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFileOpenPicker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1794071940_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPicker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ceb6cd2b44646f7b26590f8e55ad650")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPicker2(ptr: Pointer?): WithDefault = IFileOpenPicker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPicker2 {
      val address = segment.toRawLongValue()
      return makeIFileOpenPicker2(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPicker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1794071940_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPicker2): Array<IFileOpenPicker2?> = (elements as
        Array<IFileOpenPicker2?>).castToImpl<IFileOpenPicker2,IFileOpenPicker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPicker2?> =
        arrayOfNulls<IFileOpenPicker2_Impl>(size) as Array<IFileOpenPicker2?>
  }
}
