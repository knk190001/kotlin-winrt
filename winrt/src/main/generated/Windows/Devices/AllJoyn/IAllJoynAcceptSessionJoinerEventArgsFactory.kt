package Windows.Devices.AllJoyn

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynAcceptSessionJoinerEventArgsFactory.ABI::class)
@Signature("{b4435bc0-6145-429e-84db-d5bfe772b14f}")
@Guid("b4435bc06145429e84dbd5bfe772b14f")
@WinRTInterface("b4435bc06145429e84dbd5bfe772b14f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynAcceptSessionJoinerEventArgsFactory.ByReference::class)
public interface IAllJoynAcceptSessionJoinerEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    uniqueName: String?,
    sessionPort: WinDef.USHORT,
    trafficType: AllJoynTrafficType?,
    proximity: Byte,
    acceptSessionJoiner: IAllJoynAcceptSessionJoiner?
  ): AllJoynAcceptSessionJoinerEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynAcceptSessionJoinerEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIAllJoynAcceptSessionJoinerEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynAcceptSessionJoinerEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynAcceptSessionJoinerEventArgsFactory {
    public val __2075007769_Ptr: Pointer?

    public val _2075007769_VtblPtr: Pointer?
      get() = __2075007769_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      uniqueName: String?,
      sessionPort: WinDef.USHORT,
      trafficType: AllJoynTrafficType?,
      proximity: Byte,
      acceptSessionJoiner: IAllJoynAcceptSessionJoiner?
    ): AllJoynAcceptSessionJoinerEventArgs? {
      val fnPtr = _2075007769_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynAcceptSessionJoinerEventArgs>()
      val hr = fn.invokeHR(arrayOf(__2075007769_Ptr, marshalToNative(uniqueName), sessionPort,
          marshalToNative(trafficType), proximity, marshalToNative(acceptSessionJoiner), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynAcceptSessionJoinerEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynAcceptSessionJoinerEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2075007769_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynAcceptSessionJoinerEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4435bc06145429e84dbd5bfe772b14f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynAcceptSessionJoinerEventArgsFactory(ptr: Pointer?): WithDefault =
        IAllJoynAcceptSessionJoinerEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAllJoynAcceptSessionJoinerEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynAcceptSessionJoinerEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynAcceptSessionJoinerEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2075007769_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynAcceptSessionJoinerEventArgsFactory):
        Array<IAllJoynAcceptSessionJoinerEventArgsFactory?> = (elements as
        Array<IAllJoynAcceptSessionJoinerEventArgsFactory?>).castToImpl<IAllJoynAcceptSessionJoinerEventArgsFactory,IAllJoynAcceptSessionJoinerEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynAcceptSessionJoinerEventArgsFactory?> =
        arrayOfNulls<IAllJoynAcceptSessionJoinerEventArgsFactory_Impl>(size) as
        Array<IAllJoynAcceptSessionJoinerEventArgsFactory?>
  }
}
