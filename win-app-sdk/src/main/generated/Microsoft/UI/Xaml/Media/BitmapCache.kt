package Microsoft.UI.Xaml.Media

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(BitmapCache.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.BitmapCache;{4b3a8983-27a2-592a-bda4-270431eae038})")
@WinRTByReference(brClass = BitmapCache.ByReference::class)
public class BitmapCache(
  ptr: JNAPointer? = NULL
) : CacheMode(ptr), IBitmapCache.WithDefault, IWinRTObject {
  private val __125493954_Interface: IBitmapCache.WithDefault by lazy {
    as_125493954()
  }


  public override val __125493954_Ptr: JNAPointer? by lazy {
    __125493954_Interface.__125493954_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__125493954_Interface)

  public constructor() : this(ABI.activate())

  private fun as_125493954(): IBitmapCache.WithDefault {
    if(pointer == NULL) {
      return(IBitmapCache.ABI.makeIBitmapCache(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapCache>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapCache.ABI.makeIBitmapCache(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BitmapCache> {
    public override fun getValue() = BitmapCache(pointer.getPointer(0))

    public fun setValue(value: BitmapCache): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapCache, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.BitmapCache".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): BitmapCache {
      val address = segment.toRawLongValue()
      return BitmapCache(Pointer(address))
    }

    public override fun toNative(obj: BitmapCache): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
