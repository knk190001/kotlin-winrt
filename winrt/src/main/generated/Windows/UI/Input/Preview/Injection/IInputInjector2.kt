package Windows.UI.Input.Preview.Injection

import Windows.UI.Input.Preview.Injection.IInputInjector.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IInputInjector2.ABI::class)
@Signature("{8e7a905d-1453-43a7-9bcb-06d6d7b305f7}")
@Guid("8e7a905d145343a79bcb06d6d7b305f7")
@WinRTInterface("8e7a905d145343a79bcb06d6d7b305f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputInjector2.ByReference::class)
public interface IInputInjector2 : NativeMapped, IWinRTInterface, IInputInjector {
  @InterfaceMethod(0)
  public fun InitializeGamepadInjection(): Unit

  @InterfaceMethod(1)
  public fun InjectGamepadInput(input: InjectedInputGamepadInfo?): Unit

  @InterfaceMethod(2)
  public fun UninitializeGamepadInjection(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputInjector2> {
    public override fun getValue() = ABI.makeIInputInjector2(pointer.getPointer(0))

    public fun setValue(value: IInputInjector2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputInjector2, IInputInjector.WithDefault {
    public val __2071321087_Ptr: Pointer?

    public val _2071321087_VtblPtr: Pointer?
      get() = __2071321087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InitializeGamepadInjection(): Unit {
      val fnPtr = _2071321087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2071321087_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InjectGamepadInput(input: InjectedInputGamepadInfo?): Unit {
      val fnPtr = _2071321087_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2071321087_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun UninitializeGamepadInjection(): Unit {
      val fnPtr = _2071321087_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2071321087_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputInjector2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInputInjector {
    public override val __625919853_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2071321087_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2071321087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputInjector2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e7a905d145343a79bcb06d6d7b305f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputInjector2(ptr: Pointer?): WithDefault = IInputInjector2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputInjector2 {
      val address = segment.toRawLongValue()
      return makeIInputInjector2(Pointer(address))
    }

    public override fun toNative(obj: IInputInjector2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2071321087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputInjector2): Array<IInputInjector2?> = (elements as
        Array<IInputInjector2?>).castToImpl<IInputInjector2,IInputInjector2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputInjector2?> =
        arrayOfNulls<IInputInjector2_Impl>(size) as Array<IInputInjector2?>
  }
}
