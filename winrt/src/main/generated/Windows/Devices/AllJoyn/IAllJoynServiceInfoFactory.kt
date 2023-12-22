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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynServiceInfoFactory.ABI::class)
@Signature("{7581dabd-fe03-4f4b-94a4-f02fdcbd11b8}")
@Guid("7581dabdfe034f4b94a4f02fdcbd11b8")
@WinRTInterface("7581dabdfe034f4b94a4f02fdcbd11b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynServiceInfoFactory.ByReference::class)
public interface IAllJoynServiceInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    uniqueName: String?,
    objectPath: String?,
    sessionPort: WinDef.USHORT
  ): AllJoynServiceInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynServiceInfoFactory> {
    public override fun getValue() = ABI.makeIAllJoynServiceInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynServiceInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynServiceInfoFactory {
    public val __382716856_Ptr: Pointer?

    public val _382716856_VtblPtr: Pointer?
      get() = __382716856_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      uniqueName: String?,
      objectPath: String?,
      sessionPort: WinDef.USHORT
    ): AllJoynServiceInfo? {
      val fnPtr = _382716856_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynServiceInfo>()
      val hr = fn.invokeHR(arrayOf(__382716856_Ptr, marshalToNative(uniqueName),
          marshalToNative(objectPath), sessionPort, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynServiceInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynServiceInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __382716856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynServiceInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7581dabdfe034f4b94a4f02fdcbd11b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynServiceInfoFactory(ptr: Pointer?): WithDefault =
        IAllJoynServiceInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynServiceInfoFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynServiceInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynServiceInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__382716856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynServiceInfoFactory):
        Array<IAllJoynServiceInfoFactory?> = (elements as
        Array<IAllJoynServiceInfoFactory?>).castToImpl<IAllJoynServiceInfoFactory,IAllJoynServiceInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynServiceInfoFactory?> =
        arrayOfNulls<IAllJoynServiceInfoFactory_Impl>(size) as Array<IAllJoynServiceInfoFactory?>
  }
}
