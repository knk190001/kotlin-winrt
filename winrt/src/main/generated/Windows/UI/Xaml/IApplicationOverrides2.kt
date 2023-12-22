package Windows.UI.Xaml

import Windows.ApplicationModel.Activation.BackgroundActivatedEventArgs
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

@ABIMarker(IApplicationOverrides2.ABI::class)
@Signature("{db5cd2b9-d3b4-558c-c64e-0434fd1bd889}")
@Guid("db5cd2b9d3b4558cc64e0434fd1bd889")
@WinRTInterface("db5cd2b9d3b4558cc64e0434fd1bd889")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationOverrides2.ByReference::class)
public interface IApplicationOverrides2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnBackgroundActivated(args: BackgroundActivatedEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationOverrides2> {
    public override fun getValue() = ABI.makeIApplicationOverrides2(pointer.getPointer(0))

    public fun setValue(value: IApplicationOverrides2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationOverrides2 {
    public val __2029214391_Ptr: Pointer?

    public val _2029214391_VtblPtr: Pointer?
      get() = __2029214391_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnBackgroundActivated(args: BackgroundActivatedEventArgs?): Unit {
      val fnPtr = _2029214391_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2029214391_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationOverrides2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2029214391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationOverrides2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db5cd2b9d3b4558cc64e0434fd1bd889")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationOverrides2(ptr: Pointer?): WithDefault =
        IApplicationOverrides2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationOverrides2 {
      val address = segment.toRawLongValue()
      return makeIApplicationOverrides2(Pointer(address))
    }

    public override fun toNative(obj: IApplicationOverrides2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2029214391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationOverrides2): Array<IApplicationOverrides2?> =
        (elements as
        Array<IApplicationOverrides2?>).castToImpl<IApplicationOverrides2,IApplicationOverrides2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationOverrides2?> =
        arrayOfNulls<IApplicationOverrides2_Impl>(size) as Array<IApplicationOverrides2?>
  }
}
