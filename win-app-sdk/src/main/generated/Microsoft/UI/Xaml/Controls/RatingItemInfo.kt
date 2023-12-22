package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IRatingItemInfoFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RatingItemInfo.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RatingItemInfo;{801e924e-3613-55dd-8321-9ebabbed0b8a})")
@WinRTByReference(brClass = RatingItemInfo.ByReference::class)
public open class RatingItemInfo(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IRatingItemInfo.WithDefault, IWinRTObject {
  private val __1216241829_Interface: IRatingItemInfo.WithDefault by lazy {
    as_1216241829()
  }


  public override val __1216241829_Ptr: JNAPointer? by lazy {
    __1216241829_Interface.__1216241829_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1216241829_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1216241829(): IRatingItemInfo.WithDefault {
    if(pointer == NULL) {
      return(IRatingItemInfo.ABI.makeIRatingItemInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRatingItemInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRatingItemInfo.ABI.makeIRatingItemInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RatingItemInfo>
      {
    public override fun getValue() = RatingItemInfo(pointer.getPointer(0))

    public fun setValue(value: RatingItemInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RatingItemInfo, MemoryAddress> {
    public val IRatingItemInfoFactory_Instance: IRatingItemInfoFactory by lazy {
      createIRatingItemInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRatingItemInfoFactory(): IRatingItemInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RatingItemInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRatingItemInfoFactory.ABI.makeIRatingItemInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRatingItemInfoFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RatingItemInfo {
      val address = segment.toRawLongValue()
      return RatingItemInfo(Pointer(address))
    }

    public override fun toNative(obj: RatingItemInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
