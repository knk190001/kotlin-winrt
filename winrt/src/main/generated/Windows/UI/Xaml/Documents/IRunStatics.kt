package Windows.UI.Xaml.Documents

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

@ABIMarker(IRunStatics.ABI::class)
@Signature("{e9303cef-65a0-4b8d-a7f7-8fdb287b46f3}")
@Guid("e9303cef65a04b8da7f78fdb287b46f3")
@WinRTInterface("e9303cef65a04b8da7f78fdb287b46f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRunStatics.ByReference::class)
public interface IRunStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FlowDirectionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRunStatics> {
    public override fun getValue() = ABI.makeIRunStatics(pointer.getPointer(0))

    public fun setValue(value: IRunStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRunStatics {
    public val __2099093218_Ptr: Pointer?

    public val _2099093218_VtblPtr: Pointer?
      get() = __2099093218_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FlowDirectionProperty(): DependencyProperty? {
      val fnPtr = _2099093218_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2099093218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRunStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2099093218_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRunStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9303cef65a04b8da7f78fdb287b46f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRunStatics(ptr: Pointer?): WithDefault = IRunStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRunStatics {
      val address = segment.toRawLongValue()
      return makeIRunStatics(Pointer(address))
    }

    public override fun toNative(obj: IRunStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2099093218_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRunStatics): Array<IRunStatics?> = (elements as
        Array<IRunStatics?>).castToImpl<IRunStatics,IRunStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRunStatics?> =
        arrayOfNulls<IRunStatics_Impl>(size) as Array<IRunStatics?>
  }
}
