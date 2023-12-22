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

@ABIMarker(IFileSavePicker2.ABI::class)
@Signature("{0ec313a2-d24b-449a-8197-e89104fd42cc}")
@Guid("0ec313a2d24b449a8197e89104fd42cc")
@WinRTInterface("0ec313a2d24b449a8197e89104fd42cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileSavePicker2.ByReference::class)
public interface IFileSavePicker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContinuationData(): ValueSet?

  @InterfaceMethod(1)
  public fun PickSaveFileAndContinue(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileSavePicker2> {
    public override fun getValue() = ABI.makeIFileSavePicker2(pointer.getPointer(0))

    public fun setValue(value: IFileSavePicker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileSavePicker2 {
    public val __906586135_Ptr: Pointer?

    public val _906586135_VtblPtr: Pointer?
      get() = __906586135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContinuationData(): ValueSet? {
      val fnPtr = _906586135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__906586135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PickSaveFileAndContinue(): Unit {
      val fnPtr = _906586135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__906586135_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFileSavePicker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __906586135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileSavePicker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ec313a2d24b449a8197e89104fd42cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileSavePicker2(ptr: Pointer?): WithDefault = IFileSavePicker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileSavePicker2 {
      val address = segment.toRawLongValue()
      return makeIFileSavePicker2(Pointer(address))
    }

    public override fun toNative(obj: IFileSavePicker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__906586135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileSavePicker2): Array<IFileSavePicker2?> = (elements as
        Array<IFileSavePicker2?>).castToImpl<IFileSavePicker2,IFileSavePicker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileSavePicker2?> =
        arrayOfNulls<IFileSavePicker2_Impl>(size) as Array<IFileSavePicker2?>
  }
}
