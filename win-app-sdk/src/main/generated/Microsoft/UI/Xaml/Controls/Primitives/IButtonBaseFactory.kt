package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IButtonBaseFactory.ABI::class)
@Signature("{21251aa9-6fd1-5e51-ab3b-e6fcaf3395ed}")
@Guid("21251aa96fd15e51ab3be6fcaf3395ed")
@WinRTInterface("21251aa96fd15e51ab3be6fcaf3395ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButtonBaseFactory.ByReference::class)
public interface IButtonBaseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ButtonBase?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IButtonBaseFactory> {
    public override fun getValue() = ABI.makeIButtonBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IButtonBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButtonBaseFactory {
    public val __1053987274_Ptr: Pointer?

    public val _1053987274_VtblPtr: Pointer?
      get() = __1053987274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ButtonBase? {
      val fnPtr = _1053987274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ButtonBase>()
      val hr = fn.invokeHR(arrayOf(__1053987274_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ButtonBase>(result.getValue())
      return resultValue
    }
  }

  public class IButtonBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1053987274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButtonBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21251aa96fd15e51ab3be6fcaf3395ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButtonBaseFactory(ptr: Pointer?): WithDefault = IButtonBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButtonBaseFactory {
      val address = segment.toRawLongValue()
      return makeIButtonBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IButtonBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1053987274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButtonBaseFactory): Array<IButtonBaseFactory?> =
        (elements as
        Array<IButtonBaseFactory?>).castToImpl<IButtonBaseFactory,IButtonBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButtonBaseFactory?> =
        arrayOfNulls<IButtonBaseFactory_Impl>(size) as Array<IButtonBaseFactory?>
  }
}
