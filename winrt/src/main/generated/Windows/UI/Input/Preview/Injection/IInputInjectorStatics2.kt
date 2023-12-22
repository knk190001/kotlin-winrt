package Windows.UI.Input.Preview.Injection

import Windows.UI.Input.Preview.Injection.IInputInjectorStatics.ABI.IID
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

@ABIMarker(IInputInjectorStatics2.ABI::class)
@Signature("{a4db38fb-dd8c-414f-95ea-f87ef4c0ae6c}")
@Guid("a4db38fbdd8c414f95eaf87ef4c0ae6c")
@WinRTInterface("a4db38fbdd8c414f95eaf87ef4c0ae6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputInjectorStatics2.ByReference::class)
public interface IInputInjectorStatics2 : NativeMapped, IWinRTInterface, IInputInjectorStatics {
  @InterfaceMethod(0)
  public fun TryCreateForAppBroadcastOnly(): InputInjector?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputInjectorStatics2> {
    public override fun getValue() = ABI.makeIInputInjectorStatics2(pointer.getPointer(0))

    public fun setValue(value: IInputInjectorStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputInjectorStatics2, IInputInjectorStatics.WithDefault {
    public val __129192640_Ptr: Pointer?

    public val _129192640_VtblPtr: Pointer?
      get() = __129192640_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateForAppBroadcastOnly(): InputInjector? {
      val fnPtr = _129192640_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputInjector>()
      val hr = fn.invokeHR(arrayOf(__129192640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputInjector>(result.getValue())
      return resultValue
    }
  }

  public class IInputInjectorStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInputInjectorStatics {
    public override val __965663822_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_129192640_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __129192640_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputInjectorStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4db38fbdd8c414f95eaf87ef4c0ae6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputInjectorStatics2(ptr: Pointer?): WithDefault =
        IInputInjectorStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputInjectorStatics2 {
      val address = segment.toRawLongValue()
      return makeIInputInjectorStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInputInjectorStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__129192640_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputInjectorStatics2): Array<IInputInjectorStatics2?> =
        (elements as
        Array<IInputInjectorStatics2?>).castToImpl<IInputInjectorStatics2,IInputInjectorStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputInjectorStatics2?> =
        arrayOfNulls<IInputInjectorStatics2_Impl>(size) as Array<IInputInjectorStatics2?>
  }
}
