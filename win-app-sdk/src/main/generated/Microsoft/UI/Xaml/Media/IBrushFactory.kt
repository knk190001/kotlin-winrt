package Microsoft.UI.Xaml.Media

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

@ABIMarker(IBrushFactory.ABI::class)
@Signature("{b5258717-6c49-5ba5-87fd-35df382647a5}")
@Guid("b52587176c495ba587fd35df382647a5")
@WinRTInterface("b52587176c495ba587fd35df382647a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrushFactory.ByReference::class)
public interface IBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Brush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBrushFactory>
      {
    public override fun getValue() = ABI.makeIBrushFactory(pointer.getPointer(0))

    public fun setValue(value: IBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrushFactory {
    public val __293096671_Ptr: Pointer?

    public val _293096671_VtblPtr: Pointer?
      get() = __293096671_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Brush? {
      val fnPtr = _293096671_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__293096671_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }
  }

  public class IBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __293096671_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b52587176c495ba587fd35df382647a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrushFactory(ptr: Pointer?): WithDefault = IBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrushFactory {
      val address = segment.toRawLongValue()
      return makeIBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: IBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__293096671_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrushFactory): Array<IBrushFactory?> = (elements as
        Array<IBrushFactory?>).castToImpl<IBrushFactory,IBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrushFactory?> =
        arrayOfNulls<IBrushFactory_Impl>(size) as Array<IBrushFactory?>
  }
}
