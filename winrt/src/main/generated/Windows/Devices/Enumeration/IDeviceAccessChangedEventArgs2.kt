package Windows.Devices.Enumeration

import Windows.Devices.Enumeration.IDeviceAccessChangedEventArgs.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeviceAccessChangedEventArgs2.ABI::class)
@Signature("{82523262-934b-4b30-a178-adc39f2f2be3}")
@Guid("82523262934b4b30a178adc39f2f2be3")
@WinRTInterface("82523262934b4b30a178adc39f2f2be3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceAccessChangedEventArgs2.ByReference::class)
public interface IDeviceAccessChangedEventArgs2 : NativeMapped, IWinRTInterface,
    IDeviceAccessChangedEventArgs {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceAccessChangedEventArgs2> {
    public override fun getValue() = ABI.makeIDeviceAccessChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IDeviceAccessChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceAccessChangedEventArgs2,
      IDeviceAccessChangedEventArgs.WithDefault {
    public val __1421679479_Ptr: Pointer?

    public val _1421679479_VtblPtr: Pointer?
      get() = __1421679479_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1421679479_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1421679479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceAccessChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IDeviceAccessChangedEventArgs {
    public override val __322955291_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1421679479_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1421679479_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceAccessChangedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82523262934b4b30a178adc39f2f2be3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceAccessChangedEventArgs2(ptr: Pointer?): WithDefault =
        IDeviceAccessChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceAccessChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIDeviceAccessChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IDeviceAccessChangedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1421679479_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceAccessChangedEventArgs2):
        Array<IDeviceAccessChangedEventArgs2?> = (elements as
        Array<IDeviceAccessChangedEventArgs2?>).castToImpl<IDeviceAccessChangedEventArgs2,IDeviceAccessChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceAccessChangedEventArgs2?> =
        arrayOfNulls<IDeviceAccessChangedEventArgs2_Impl>(size) as
        Array<IDeviceAccessChangedEventArgs2?>
  }
}
