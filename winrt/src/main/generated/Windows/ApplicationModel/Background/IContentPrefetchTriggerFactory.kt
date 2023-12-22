package Windows.ApplicationModel.Background

import Windows.Foundation.TimeSpan
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

@ABIMarker(IContentPrefetchTriggerFactory.ABI::class)
@Signature("{c2643eda-8a03-409e-b8c4-88814c28ccb6}")
@Guid("c2643eda8a03409eb8c488814c28ccb6")
@WinRTInterface("c2643eda8a03409eb8c488814c28ccb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPrefetchTriggerFactory.ByReference::class)
public interface IContentPrefetchTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(waitInterval: TimeSpan?): ContentPrefetchTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPrefetchTriggerFactory> {
    public override fun getValue() = ABI.makeIContentPrefetchTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IContentPrefetchTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPrefetchTriggerFactory {
    public val __1886544273_Ptr: Pointer?

    public val _1886544273_VtblPtr: Pointer?
      get() = __1886544273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(waitInterval: TimeSpan?): ContentPrefetchTrigger? {
      val fnPtr = _1886544273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentPrefetchTrigger>()
      val hr = fn.invokeHR(arrayOf(__1886544273_Ptr, marshalToNative(waitInterval), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentPrefetchTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IContentPrefetchTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1886544273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPrefetchTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2643eda8a03409eb8c488814c28ccb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPrefetchTriggerFactory(ptr: Pointer?): WithDefault =
        IContentPrefetchTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPrefetchTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIContentPrefetchTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentPrefetchTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1886544273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPrefetchTriggerFactory):
        Array<IContentPrefetchTriggerFactory?> = (elements as
        Array<IContentPrefetchTriggerFactory?>).castToImpl<IContentPrefetchTriggerFactory,IContentPrefetchTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPrefetchTriggerFactory?> =
        arrayOfNulls<IContentPrefetchTriggerFactory_Impl>(size) as
        Array<IContentPrefetchTriggerFactory?>
  }
}
