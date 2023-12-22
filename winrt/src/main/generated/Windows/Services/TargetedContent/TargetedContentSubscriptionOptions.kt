package Windows.Services.TargetedContent

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TargetedContentSubscriptionOptions.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentSubscriptionOptions;{61ee6ad0-2c83-421b-8467-413eaf1aeb97})")
@WinRTByReference(brClass = TargetedContentSubscriptionOptions.ByReference::class)
public class TargetedContentSubscriptionOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentSubscriptionOptions.WithDefault, IWinRTObject {
  private val __2034013379_Interface: ITargetedContentSubscriptionOptions.WithDefault by lazy {
    as_2034013379()
  }


  public override val __2034013379_Ptr: JNAPointer? by lazy {
    __2034013379_Interface.__2034013379_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2034013379_Interface)

  private fun as_2034013379(): ITargetedContentSubscriptionOptions.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentSubscriptionOptions.ABI.makeITargetedContentSubscriptionOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentSubscriptionOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentSubscriptionOptions.ABI.makeITargetedContentSubscriptionOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentSubscriptionOptions> {
    public override fun getValue() = TargetedContentSubscriptionOptions(pointer.getPointer(0))

    public fun setValue(value: TargetedContentSubscriptionOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentSubscriptionOptions, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetedContentSubscriptionOptions {
      val address = segment.toRawLongValue()
      return TargetedContentSubscriptionOptions(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentSubscriptionOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
