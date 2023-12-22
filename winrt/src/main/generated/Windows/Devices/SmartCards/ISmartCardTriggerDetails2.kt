package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardTriggerDetails2.ABI::class)
@Signature("{2945c569-8975-4a51-9e1a-5f8a76ee51af}")
@Guid("2945c56989754a519e1a5f8a76ee51af")
@WinRTInterface("2945c56989754a519e1a5f8a76ee51af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardTriggerDetails2.ByReference::class)
public interface ISmartCardTriggerDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Emulator(): SmartCardEmulator?

  @InterfaceMethod(1)
  public fun TryLaunchCurrentAppAsync(arguments: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun TryLaunchCurrentAppAsync(arguments: String?, behavior: SmartCardLaunchBehavior?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardTriggerDetails2> {
    public override fun getValue() = ABI.makeISmartCardTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardTriggerDetails2 {
    public val __812432898_Ptr: Pointer?

    public val _812432898_VtblPtr: Pointer?
      get() = __812432898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Emulator(): SmartCardEmulator? {
      val fnPtr = _812432898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardEmulator>()
      val hr = fn.invokeHR(arrayOf(__812432898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardEmulator>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryLaunchCurrentAppAsync(arguments: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _812432898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__812432898_Ptr, marshalToNative(arguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryLaunchCurrentAppAsync(arguments: String?,
        behavior: SmartCardLaunchBehavior?): IAsyncOperation<Boolean>? {
      val fnPtr = _812432898_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__812432898_Ptr, marshalToNative(arguments),
          marshalToNative(behavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __812432898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2945c56989754a519e1a5f8a76ee51af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardTriggerDetails2(ptr: Pointer?): WithDefault =
        ISmartCardTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeISmartCardTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardTriggerDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__812432898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardTriggerDetails2):
        Array<ISmartCardTriggerDetails2?> = (elements as
        Array<ISmartCardTriggerDetails2?>).castToImpl<ISmartCardTriggerDetails2,ISmartCardTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardTriggerDetails2?> =
        arrayOfNulls<ISmartCardTriggerDetails2_Impl>(size) as Array<ISmartCardTriggerDetails2?>
  }
}
