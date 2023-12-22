package Windows.UI.Xaml.Data

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IBindingBaseFactory.ABI::class)
@Signature("{22dafc3a-7701-4666-a1ba-9859bdcfec34}")
@Guid("22dafc3a77014666a1ba9859bdcfec34")
@WinRTInterface("22dafc3a77014666a1ba9859bdcfec34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingBaseFactory.ByReference::class)
public interface IBindingBaseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): BindingBase?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingBaseFactory> {
    public override fun getValue() = ABI.makeIBindingBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IBindingBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingBaseFactory {
    public val __1996070236_Ptr: Pointer?

    public val _1996070236_VtblPtr: Pointer?
      get() = __1996070236_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        BindingBase? {
      val fnPtr = _1996070236_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BindingBase>()
      val hr = fn.invokeHR(arrayOf(__1996070236_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BindingBase>(result.getValue())
      return resultValue
    }
  }

  public class IBindingBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1996070236_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22dafc3a77014666a1ba9859bdcfec34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingBaseFactory(ptr: Pointer?): WithDefault = IBindingBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingBaseFactory {
      val address = segment.toRawLongValue()
      return makeIBindingBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IBindingBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1996070236_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingBaseFactory): Array<IBindingBaseFactory?> =
        (elements as
        Array<IBindingBaseFactory?>).castToImpl<IBindingBaseFactory,IBindingBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingBaseFactory?> =
        arrayOfNulls<IBindingBaseFactory_Impl>(size) as Array<IBindingBaseFactory?>
  }
}
