package Windows.Networking.Sockets

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDatagramSocketControl.ABI::class)
@Signature("{52ac3f2e-349a-4135-bb58-b79b2647d390}")
@Guid("52ac3f2e349a4135bb58b79b2647d390")
@WinRTInterface("52ac3f2e349a4135bb58b79b2647d390")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocketControl.ByReference::class)
public interface IDatagramSocketControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QualityOfService(): SocketQualityOfService?

  @InterfaceMethod(1)
  public fun put_QualityOfService(value: SocketQualityOfService?): Unit

  @InterfaceMethod(2)
  public fun get_OutboundUnicastHopLimit(): Byte

  @InterfaceMethod(3)
  public fun put_OutboundUnicastHopLimit(value: Byte): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatagramSocketControl> {
    public override fun getValue() = ABI.makeIDatagramSocketControl(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocketControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocketControl {
    public val __1328345905_Ptr: Pointer?

    public val _1328345905_VtblPtr: Pointer?
      get() = __1328345905_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QualityOfService(): SocketQualityOfService? {
      val fnPtr = _1328345905_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketQualityOfService>()
      val hr = fn.invokeHR(arrayOf(__1328345905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketQualityOfService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_QualityOfService(value: SocketQualityOfService?): Unit {
      val fnPtr = _1328345905_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1328345905_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OutboundUnicastHopLimit(): Byte {
      val fnPtr = _1328345905_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1328345905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_OutboundUnicastHopLimit(value: Byte): Unit {
      val fnPtr = _1328345905_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1328345905_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatagramSocketControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1328345905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocketControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52ac3f2e349a4135bb58b79b2647d390")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocketControl(ptr: Pointer?): WithDefault =
        IDatagramSocketControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatagramSocketControl {
      val address = segment.toRawLongValue()
      return makeIDatagramSocketControl(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1328345905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocketControl): Array<IDatagramSocketControl?> =
        (elements as
        Array<IDatagramSocketControl?>).castToImpl<IDatagramSocketControl,IDatagramSocketControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocketControl?> =
        arrayOfNulls<IDatagramSocketControl_Impl>(size) as Array<IDatagramSocketControl?>
  }
}
