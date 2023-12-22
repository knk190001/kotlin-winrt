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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICurrentChangingEventArgsFactory.ABI::class)
@Signature("{153bbeee-62f3-48cf-8183-8be26de3a66e}")
@Guid("153bbeee62f348cf81838be26de3a66e")
@WinRTInterface("153bbeee62f348cf81838be26de3a66e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentChangingEventArgsFactory.ByReference::class)
public interface ICurrentChangingEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      CurrentChangingEventArgs?

  @InterfaceMethod(1)
  public fun CreateWithCancelableParameter(
    isCancelable: Boolean,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): CurrentChangingEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentChangingEventArgsFactory> {
    public override fun getValue() = ABI.makeICurrentChangingEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: ICurrentChangingEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentChangingEventArgsFactory {
    public val __1164220303_Ptr: Pointer?

    public val _1164220303_VtblPtr: Pointer?
      get() = __1164220303_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CurrentChangingEventArgs? {
      val fnPtr = _1164220303_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CurrentChangingEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1164220303_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CurrentChangingEventArgs>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithCancelableParameter(
      isCancelable: Boolean,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): CurrentChangingEventArgs? {
      val fnPtr = _1164220303_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CurrentChangingEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1164220303_Ptr, isCancelable, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CurrentChangingEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentChangingEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1164220303_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentChangingEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("153bbeee62f348cf81838be26de3a66e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentChangingEventArgsFactory(ptr: Pointer?): WithDefault =
        ICurrentChangingEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentChangingEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeICurrentChangingEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: ICurrentChangingEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1164220303_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentChangingEventArgsFactory):
        Array<ICurrentChangingEventArgsFactory?> = (elements as
        Array<ICurrentChangingEventArgsFactory?>).castToImpl<ICurrentChangingEventArgsFactory,ICurrentChangingEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentChangingEventArgsFactory?> =
        arrayOfNulls<ICurrentChangingEventArgsFactory_Impl>(size) as
        Array<ICurrentChangingEventArgsFactory?>
  }
}
