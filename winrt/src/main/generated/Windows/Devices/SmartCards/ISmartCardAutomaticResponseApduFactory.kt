package Windows.Devices.SmartCards

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISmartCardAutomaticResponseApduFactory.ABI::class)
@Signature("{e97ea2fa-d02c-4c55-b02a-8cff7fa9f05b}")
@Guid("e97ea2fad02c4c55b02a8cff7fa9f05b")
@WinRTInterface("e97ea2fad02c4c55b02a8cff7fa9f05b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardAutomaticResponseApduFactory.ByReference::class)
public interface ISmartCardAutomaticResponseApduFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(commandApdu: IBuffer?, responseApdu: IBuffer?): SmartCardAutomaticResponseApdu?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardAutomaticResponseApduFactory> {
    public override fun getValue() =
        ABI.makeISmartCardAutomaticResponseApduFactory(pointer.getPointer(0))

    public fun setValue(value: ISmartCardAutomaticResponseApduFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardAutomaticResponseApduFactory {
    public val __1777232132_Ptr: Pointer?

    public val _1777232132_VtblPtr: Pointer?
      get() = __1777232132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(commandApdu: IBuffer?, responseApdu: IBuffer?):
        SmartCardAutomaticResponseApdu? {
      val fnPtr = _1777232132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardAutomaticResponseApdu>()
      val hr = fn.invokeHR(arrayOf(__1777232132_Ptr, marshalToNative(commandApdu),
          marshalToNative(responseApdu), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardAutomaticResponseApdu>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardAutomaticResponseApduFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1777232132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardAutomaticResponseApduFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e97ea2fad02c4c55b02a8cff7fa9f05b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardAutomaticResponseApduFactory(ptr: Pointer?): WithDefault =
        ISmartCardAutomaticResponseApduFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardAutomaticResponseApduFactory {
      val address = segment.toRawLongValue()
      return makeISmartCardAutomaticResponseApduFactory(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardAutomaticResponseApduFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1777232132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardAutomaticResponseApduFactory):
        Array<ISmartCardAutomaticResponseApduFactory?> = (elements as
        Array<ISmartCardAutomaticResponseApduFactory?>).castToImpl<ISmartCardAutomaticResponseApduFactory,ISmartCardAutomaticResponseApduFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardAutomaticResponseApduFactory?> =
        arrayOfNulls<ISmartCardAutomaticResponseApduFactory_Impl>(size) as
        Array<ISmartCardAutomaticResponseApduFactory?>
  }
}
