package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IComboBoxStatics4.ABI::class)
@Signature("{d9f58358-f7b0-46ce-8061-ad83ec2f2dd4}")
@Guid("d9f58358f7b046ce8061ad83ec2f2dd4")
@WinRTInterface("d9f58358f7b046ce8061ad83ec2f2dd4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxStatics4.ByReference::class)
public interface IComboBoxStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionChangedTriggerProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxStatics4> {
    public override fun getValue() = ABI.makeIComboBoxStatics4(pointer.getPointer(0))

    public fun setValue(value: IComboBoxStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxStatics4 {
    public val __1235937880_Ptr: Pointer?

    public val _1235937880_VtblPtr: Pointer?
      get() = __1235937880_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionChangedTriggerProperty(): DependencyProperty? {
      val fnPtr = _1235937880_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937880_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1235937880_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9f58358f7b046ce8061ad83ec2f2dd4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxStatics4(ptr: Pointer?): WithDefault = IComboBoxStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxStatics4 {
      val address = segment.toRawLongValue()
      return makeIComboBoxStatics4(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1235937880_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxStatics4): Array<IComboBoxStatics4?> = (elements
        as Array<IComboBoxStatics4?>).castToImpl<IComboBoxStatics4,IComboBoxStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxStatics4?> =
        arrayOfNulls<IComboBoxStatics4_Impl>(size) as Array<IComboBoxStatics4?>
  }
}
