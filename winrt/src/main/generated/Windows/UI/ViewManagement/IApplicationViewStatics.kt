package Windows.UI.ViewManagement

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationViewStatics.ABI::class)
@Signature("{010a6306-c433-44e5-a9f2-bd84d4030a95}")
@Guid("010a6306c43344e5a9f2bd84d4030a95")
@WinRTInterface("010a6306c43344e5a9f2bd84d4030a95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewStatics.ByReference::class)
public interface IApplicationViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): ApplicationViewState?

  @InterfaceMethod(1)
  public fun TryUnsnap(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewStatics> {
    public override fun getValue() = ABI.makeIApplicationViewStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewStatics {
    public val __1236397826_Ptr: Pointer?

    public val _1236397826_VtblPtr: Pointer?
      get() = __1236397826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): ApplicationViewState? {
      val fnPtr = _1236397826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationViewState>()
      val hr = fn.invokeHR(arrayOf(__1236397826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationViewState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryUnsnap(): Boolean {
      val fnPtr = _1236397826_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1236397826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IApplicationViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1236397826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("010a6306c43344e5a9f2bd84d4030a95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewStatics(ptr: Pointer?): WithDefault =
        IApplicationViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationViewStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1236397826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewStatics): Array<IApplicationViewStatics?>
        = (elements as
        Array<IApplicationViewStatics?>).castToImpl<IApplicationViewStatics,IApplicationViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewStatics?> =
        arrayOfNulls<IApplicationViewStatics_Impl>(size) as Array<IApplicationViewStatics?>
  }
}
