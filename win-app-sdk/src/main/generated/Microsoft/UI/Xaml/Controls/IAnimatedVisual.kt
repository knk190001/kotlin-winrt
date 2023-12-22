package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Composition.Visual
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.TimeSpan
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

@ABIMarker(IAnimatedVisual.ABI::class)
@Signature("{645ff609-fd6b-5fef-bdc0-9c34eff33c64}")
@Guid("645ff609fd6b5fefbdc09c34eff33c64")
@WinRTInterface("645ff609fd6b5fefbdc09c34eff33c64")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisual.ByReference::class)
public interface IAnimatedVisual : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_RootVisual(): Visual?

  @InterfaceMethod(1)
  public fun get_Size(): Vector2?

  @InterfaceMethod(2)
  public fun get_Duration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisual> {
    public override fun getValue() = ABI.makeIAnimatedVisual(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisual, IClosable.WithDefault {
    public val __2023373898_Ptr: Pointer?

    public val _2023373898_VtblPtr: Pointer?
      get() = __2023373898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RootVisual(): Visual? {
      val fnPtr = _2023373898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__2023373898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Size(): Vector2? {
      val fnPtr = _2023373898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__2023373898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _2023373898_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2023373898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2023373898_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2023373898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("645ff609fd6b5fefbdc09c34eff33c64")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisual(ptr: Pointer?): WithDefault = IAnimatedVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisual {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisual(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2023373898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisual): Array<IAnimatedVisual?> = (elements as
        Array<IAnimatedVisual?>).castToImpl<IAnimatedVisual,IAnimatedVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisual?> =
        arrayOfNulls<IAnimatedVisual_Impl>(size) as Array<IAnimatedVisual?>
  }
}
