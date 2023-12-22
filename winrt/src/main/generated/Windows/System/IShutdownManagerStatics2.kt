package Windows.System

import Windows.Foundation.TimeSpan
import Windows.System.IShutdownManagerStatics.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IShutdownManagerStatics2.ABI::class)
@Signature("{0f69a02f-9c34-43c7-a8c3-70b30a7f7504}")
@Guid("0f69a02f9c3443c7a8c370b30a7f7504")
@WinRTInterface("0f69a02f9c3443c7a8c370b30a7f7504")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShutdownManagerStatics2.ByReference::class)
public interface IShutdownManagerStatics2 : NativeMapped, IWinRTInterface, IShutdownManagerStatics {
  @InterfaceMethod(0)
  public fun IsPowerStateSupported(powerState: PowerState?): Boolean

  @InterfaceMethod(1)
  public fun EnterPowerState(powerState: PowerState?): Unit

  @InterfaceMethod(2)
  public fun EnterPowerState(powerState: PowerState?, wakeUpAfter: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShutdownManagerStatics2> {
    public override fun getValue() = ABI.makeIShutdownManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IShutdownManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShutdownManagerStatics2, IShutdownManagerStatics.WithDefault {
    public val __84989525_Ptr: Pointer?

    public val _84989525_VtblPtr: Pointer?
      get() = __84989525_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsPowerStateSupported(powerState: PowerState?): Boolean {
      val fnPtr = _84989525_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__84989525_Ptr, marshalToNative(powerState), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun EnterPowerState(powerState: PowerState?): Unit {
      val fnPtr = _84989525_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__84989525_Ptr, marshalToNative(powerState),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun EnterPowerState(powerState: PowerState?, wakeUpAfter: TimeSpan?): Unit {
      val fnPtr = _84989525_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__84989525_Ptr, marshalToNative(powerState),
          marshalToNative(wakeUpAfter),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShutdownManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IShutdownManagerStatics {
    public override val __1111120253_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_84989525_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __84989525_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShutdownManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f69a02f9c3443c7a8c370b30a7f7504")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShutdownManagerStatics2(ptr: Pointer?): WithDefault =
        IShutdownManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShutdownManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIShutdownManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IShutdownManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__84989525_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShutdownManagerStatics2):
        Array<IShutdownManagerStatics2?> = (elements as
        Array<IShutdownManagerStatics2?>).castToImpl<IShutdownManagerStatics2,IShutdownManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShutdownManagerStatics2?> =
        arrayOfNulls<IShutdownManagerStatics2_Impl>(size) as Array<IShutdownManagerStatics2?>
  }
}
