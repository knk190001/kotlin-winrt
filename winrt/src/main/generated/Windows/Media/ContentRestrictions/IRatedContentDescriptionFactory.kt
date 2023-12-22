package Windows.Media.ContentRestrictions

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

@ABIMarker(IRatedContentDescriptionFactory.ABI::class)
@Signature("{2e38df62-9b90-4fa6-89c1-4b8d2ffb3573}")
@Guid("2e38df629b904fa689c14b8d2ffb3573")
@WinRTInterface("2e38df629b904fa689c14b8d2ffb3573")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatedContentDescriptionFactory.ByReference::class)
public interface IRatedContentDescriptionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    id: String?,
    title: String?,
    category: RatedContentCategory?
  ): RatedContentDescription?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatedContentDescriptionFactory> {
    public override fun getValue() = ABI.makeIRatedContentDescriptionFactory(pointer.getPointer(0))

    public fun setValue(value: IRatedContentDescriptionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatedContentDescriptionFactory {
    public val __420871105_Ptr: Pointer?

    public val _420871105_VtblPtr: Pointer?
      get() = __420871105_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      id: String?,
      title: String?,
      category: RatedContentCategory?
    ): RatedContentDescription? {
      val fnPtr = _420871105_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RatedContentDescription>()
      val hr = fn.invokeHR(arrayOf(__420871105_Ptr, marshalToNative(id), marshalToNative(title),
          marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RatedContentDescription>(result.getValue())
      return resultValue
    }
  }

  public class IRatedContentDescriptionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __420871105_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatedContentDescriptionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e38df629b904fa689c14b8d2ffb3573")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatedContentDescriptionFactory(ptr: Pointer?): WithDefault =
        IRatedContentDescriptionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatedContentDescriptionFactory {
      val address = segment.toRawLongValue()
      return makeIRatedContentDescriptionFactory(Pointer(address))
    }

    public override fun toNative(obj: IRatedContentDescriptionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__420871105_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatedContentDescriptionFactory):
        Array<IRatedContentDescriptionFactory?> = (elements as
        Array<IRatedContentDescriptionFactory?>).castToImpl<IRatedContentDescriptionFactory,IRatedContentDescriptionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatedContentDescriptionFactory?> =
        arrayOfNulls<IRatedContentDescriptionFactory_Impl>(size) as
        Array<IRatedContentDescriptionFactory?>
  }
}
