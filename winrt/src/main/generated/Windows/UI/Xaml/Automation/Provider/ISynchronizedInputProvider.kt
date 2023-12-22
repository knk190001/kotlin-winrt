package Windows.UI.Xaml.Automation.Provider

import Windows.UI.Xaml.Automation.SynchronizedInputType
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

@ABIMarker(ISynchronizedInputProvider.ABI::class)
@Signature("{3d60cecb-da54-4aa3-b915-e3244427d4ac}")
@Guid("3d60cecbda544aa3b915e3244427d4ac")
@WinRTInterface("3d60cecbda544aa3b915e3244427d4ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISynchronizedInputProvider.ByReference::class)
public interface ISynchronizedInputProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Cancel(): Unit

  @InterfaceMethod(1)
  public fun StartListening(inputType: SynchronizedInputType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISynchronizedInputProvider> {
    public override fun getValue() = ABI.makeISynchronizedInputProvider(pointer.getPointer(0))

    public fun setValue(value: ISynchronizedInputProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISynchronizedInputProvider {
    public val __1549317391_Ptr: Pointer?

    public val _1549317391_VtblPtr: Pointer?
      get() = __1549317391_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Cancel(): Unit {
      val fnPtr = _1549317391_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1549317391_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun StartListening(inputType: SynchronizedInputType?): Unit {
      val fnPtr = _1549317391_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1549317391_Ptr, marshalToNative(inputType),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISynchronizedInputProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1549317391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISynchronizedInputProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d60cecbda544aa3b915e3244427d4ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISynchronizedInputProvider(ptr: Pointer?): WithDefault =
        ISynchronizedInputProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISynchronizedInputProvider {
      val address = segment.toRawLongValue()
      return makeISynchronizedInputProvider(Pointer(address))
    }

    public override fun toNative(obj: ISynchronizedInputProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1549317391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISynchronizedInputProvider):
        Array<ISynchronizedInputProvider?> = (elements as
        Array<ISynchronizedInputProvider?>).castToImpl<ISynchronizedInputProvider,ISynchronizedInputProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISynchronizedInputProvider?> =
        arrayOfNulls<ISynchronizedInputProvider_Impl>(size) as Array<ISynchronizedInputProvider?>
  }
}
