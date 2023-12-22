package Windows.UI.Xaml.Controls

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

@ABIMarker(IParallaxViewFactory.ABI::class)
@Signature("{e4eb9642-3e8e-5a26-94f2-9121d121b916}")
@Guid("e4eb96423e8e5a2694f29121d121b916")
@WinRTInterface("e4eb96423e8e5a2694f29121d121b916")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IParallaxViewFactory.ByReference::class)
public interface IParallaxViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ParallaxView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IParallaxViewFactory> {
    public override fun getValue() = ABI.makeIParallaxViewFactory(pointer.getPointer(0))

    public fun setValue(value: IParallaxViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IParallaxViewFactory {
    public val __420132594_Ptr: Pointer?

    public val _420132594_VtblPtr: Pointer?
      get() = __420132594_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ParallaxView? {
      val fnPtr = _420132594_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ParallaxView>()
      val hr = fn.invokeHR(arrayOf(__420132594_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ParallaxView>(result.getValue())
      return resultValue
    }
  }

  public class IParallaxViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __420132594_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IParallaxViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4eb96423e8e5a2694f29121d121b916")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIParallaxViewFactory(ptr: Pointer?): WithDefault = IParallaxViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IParallaxViewFactory {
      val address = segment.toRawLongValue()
      return makeIParallaxViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IParallaxViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__420132594_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IParallaxViewFactory): Array<IParallaxViewFactory?> =
        (elements as
        Array<IParallaxViewFactory?>).castToImpl<IParallaxViewFactory,IParallaxViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IParallaxViewFactory?> =
        arrayOfNulls<IParallaxViewFactory_Impl>(size) as Array<IParallaxViewFactory?>
  }
}
