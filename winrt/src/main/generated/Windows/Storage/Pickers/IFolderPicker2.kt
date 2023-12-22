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

@ABIMarker(IFolderPicker2.ABI::class)
@Signature("{8eb3ba97-dc85-4616-be94-9660881f2f5d}")
@Guid("8eb3ba97dc854616be949660881f2f5d")
@WinRTInterface("8eb3ba97dc854616be949660881f2f5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFolderPicker2.ByReference::class)
public interface IFolderPicker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContinuationData(): ValueSet?

  @InterfaceMethod(1)
  public fun PickFolderAndContinue(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFolderPicker2>
      {
    public override fun getValue() = ABI.makeIFolderPicker2(pointer.getPointer(0))

    public fun setValue(value: IFolderPicker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFolderPicker2 {
    public val __1762225780_Ptr: Pointer?

    public val _1762225780_VtblPtr: Pointer?
      get() = __1762225780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContinuationData(): ValueSet? {
      val fnPtr = _1762225780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1762225780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PickFolderAndContinue(): Unit {
      val fnPtr = _1762225780_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1762225780_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFolderPicker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1762225780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFolderPicker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8eb3ba97dc854616be949660881f2f5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFolderPicker2(ptr: Pointer?): WithDefault = IFolderPicker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFolderPicker2 {
      val address = segment.toRawLongValue()
      return makeIFolderPicker2(Pointer(address))
    }

    public override fun toNative(obj: IFolderPicker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1762225780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFolderPicker2): Array<IFolderPicker2?> = (elements as
        Array<IFolderPicker2?>).castToImpl<IFolderPicker2,IFolderPicker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFolderPicker2?> =
        arrayOfNulls<IFolderPicker2_Impl>(size) as Array<IFolderPicker2?>
  }
}
