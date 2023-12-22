package Windows.Devices.Perception.Provider

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerceptionControlGroupFactory.ABI::class)
@Signature("{2f1af2e0-baf1-453b-bed4-cd9d4619154c}")
@Guid("2f1af2e0baf1453bbed4cd9d4619154c")
@WinRTInterface("2f1af2e0baf1453bbed4cd9d4619154c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionControlGroupFactory.ByReference::class)
public interface IPerceptionControlGroupFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(ids: IIterable<String?>?): PerceptionControlGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionControlGroupFactory> {
    public override fun getValue() = ABI.makeIPerceptionControlGroupFactory(pointer.getPointer(0))

    public fun setValue(value: IPerceptionControlGroupFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionControlGroupFactory {
    public val __1671661496_Ptr: Pointer?

    public val _1671661496_VtblPtr: Pointer?
      get() = __1671661496_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(ids: IIterable<String?>?): PerceptionControlGroup? {
      val fnPtr = _1671661496_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionControlGroup>()
      val hr = fn.invokeHR(arrayOf(__1671661496_Ptr, marshalToNative(ids), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionControlGroup>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionControlGroupFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1671661496_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionControlGroupFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f1af2e0baf1453bbed4cd9d4619154c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionControlGroupFactory(ptr: Pointer?): WithDefault =
        IPerceptionControlGroupFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionControlGroupFactory {
      val address = segment.toRawLongValue()
      return makeIPerceptionControlGroupFactory(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionControlGroupFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1671661496_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionControlGroupFactory):
        Array<IPerceptionControlGroupFactory?> = (elements as
        Array<IPerceptionControlGroupFactory?>).castToImpl<IPerceptionControlGroupFactory,IPerceptionControlGroupFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionControlGroupFactory?> =
        arrayOfNulls<IPerceptionControlGroupFactory_Impl>(size) as
        Array<IPerceptionControlGroupFactory?>
  }
}
